package com.wxz.custom.bean;

import com.wxz.custom.anno.Bean;
import com.wxz.custom.anno.Di;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author wxz
 * @date 20:10 2024/1/12
 */
public class AnnotationApplicationContext implements ApplicationContext
{
    /**
     * 包路径前缀
     */
    private static String rootPath;
    /**
     * 创建 map 集合，放 bean 对象
     */
    private final Map<Class<?>, Object> beanFactory = new HashMap<>();

    /**
     * 设置包扫描规则
     *
     * @param basePackage 包路径
     * @return null
     * @author wxz
     * @date 20:46 2024/1/12
     */
    public AnnotationApplicationContext(String basePackage)
    {
        try
        {
            // 把 . 替换成 \
            String packagePath = basePackage.replaceAll("\\.", "/");
            // 获取包绝对路径
            URL resource = Thread.currentThread().getContextClassLoader().getResource(packagePath);
            Enumeration<URL> urls = Thread.currentThread().getContextClassLoader().getResources(packagePath);
            while (urls.hasMoreElements())
            {
                URL url = urls.nextElement();
                String filePath = URLDecoder.decode(url.getPath(), StandardCharsets.UTF_8);
                // 获取包前面路径部分，字符串截取
                rootPath = filePath.substring(0, filePath.length() - packagePath.length());
                // 包扫描
                loadBean(new File(filePath));
            }
        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }

        // 属性注入
        loadDi();
    }

    /**
     * 属性注入
     *
     * @author wxz
     * @date 21:34 2024/1/13
     */
    private void loadDi()
    {
        Set<Map.Entry<Class<?>, Object>> entries = beanFactory.entrySet();
        for (Map.Entry<Class<?>, Object> entry : entries)
        {
            Object obj = entry.getValue();
            Class<?> clazz = obj.getClass();
            Field[] declaredFields = clazz.getDeclaredFields();
            for (Field field : declaredFields)
            {
                if (field.isAnnotationPresent(Di.class))
                {
                    field.setAccessible(true);
                    try
                    {
                        field.set(obj, beanFactory.get(field.getType()));
                    } catch (IllegalAccessException e)
                    {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }

    /**
     * 包扫描过程
     *
     * @param file file
     * @author wxz
     * @date 21:03 2024/1/12
     */
    private void loadBean(File file)
    {
        // 判断当前是否是文件夹
        if (file.isDirectory())
        {
            // 获取文件夹的所有内容
            File[] childrenFiles = file.listFiles();
            // 判断文件夹里面为空，直接返回
            if (childrenFiles == null || childrenFiles.length == 0)
            {
                return;
            }
            // 如果文件夹里面不为空，遍历文件夹所有内容
            for (File child : childrenFiles)
            {
                // 遍历得到每个 File 对象，继续判断，如果还是文件夹，递归
                if (child.isDirectory())
                {
                    loadBean(child);
                }
                else
                {
                    // 得到包路径
                    String pathWithClass = child.getAbsolutePath().substring(rootPath.length());
                    // 判断当前文件类型是否 .class
                    if (pathWithClass.contains(".class"))
                    {
                        try
                        {
                            String allName = pathWithClass.replaceAll("/", ".").replace(".class", "");
                            Class<?> clazz = Class.forName(allName);
                            if (!clazz.isInterface())
                            {
                                Bean annotation = clazz.getAnnotation(Bean.class);
                                if (annotation != null)
                                {
                                    // 实例化
                                    Object instance = clazz.getConstructor().newInstance();
                                    // 放入 map 集合
                                    if (clazz.getInterfaces().length > 0)
                                    {
                                        beanFactory.put(clazz.getInterfaces()[0], instance);
                                    }
                                    else
                                    {
                                        beanFactory.put(clazz, instance);
                                    }
                                }
                            }
                        } catch (Exception e)
                        {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }
    }

    /**
     * 返回对象
     *
     * @param clazz clazz
     * @return java.lang.Object
     * @author wxz
     * @date 20:10 2024/1/12
     */
    @Override
    public Object getBean(Class<?> clazz)
    {
        return beanFactory.get(clazz);
    }
}
