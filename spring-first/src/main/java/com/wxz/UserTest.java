package com.wxz;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试 User 类
 *
 * @author wxz
 * @date 16:07 2024/1/10
 */
public class UserTest
{
    /**
     * 测试 Spring 对象创建
     *
     * @author wxz
     * @date 16:18 2024/1/10
     */
    @Test
    public void testUserObject()
    {
        // 加载 Spring 配置文件，对象创建
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        // 获取创建的对象
        User user = (User) context.getBean("user");

        System.out.println(user);

        // 测试对象方法
        user.add();
    }

    /**
     * 反射创建对象
     *
     * @author wxz
     * @date 16:19 2024/1/10
     */
    @Test
    public void testUserObject1() throws Exception
    {
        // 获取类 Class 创建
        Class<?> clazz = Class.forName("com.wxz.User");
        // 调用方法创建对象
        User user = (User) clazz.getDeclaredConstructor().newInstance();

        System.out.println(user);
    }
}
