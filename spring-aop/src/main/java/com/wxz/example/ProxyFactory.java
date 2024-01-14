package com.wxz.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author wxz
 * @date 12:10 2024/1/14
 */
public class ProxyFactory
{
    private final Object target;

    /**
     * 构造方法
     *
     * @param target 代理对象
     * @return null
     * @author wxz
     * @date 12:23 2024/1/14
     */
    public ProxyFactory(Object target)
    {
        this.target = target;
    }

    /**
     * 返回代理对象
     *
     * @return java.lang.Object
     * @author wxz
     * @date 12:10 2024/1/14
     */
    public Object getProxy()
    {
        // 加载动态生成代理类的类加载器
        ClassLoader classLoader = target.getClass().getClassLoader();
        // 目标对象实现的所有借口的 class 类型数组
        Class<?>[] interfaces = target.getClass().getInterfaces();
        // 设置代理对象实现目标方法的过程
        // proxy：代理对象 method：目标对象的方法 args：目标对象的方法参数
        InvocationHandler invocationHandler = (proxy, method, args) ->
        {
            System.out.println("[动态代理][日志] " + method.getName() + " 方法开始了，参数是：[" + Arrays.toString(args) + "]");
            Object result = method.invoke(target, args);
            System.out.println("[动态代理][日志] " + method.getName() + " 方法结束了，结果是：" + result);
            return result;
        };
        return Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
    }
}
