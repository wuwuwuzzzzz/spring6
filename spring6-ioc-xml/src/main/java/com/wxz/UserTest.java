package com.wxz;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wxz
 * @date 21:19 2024/1/10
 */
public class UserTest
{
    /**
     * 获取 bean 对象
     * @author wxz
     * @date 21:20 2024/1/10
     */
    public static void main(String[] args)
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        // 根据 id 获取 bean
        User userById = (User) context.getBean("user");
        System.out.println("根据 id 获取 bean：" + userById);

        // 根据类型获取 bean
        User userByType = context.getBean(User.class);
        System.out.println("根据类型获取bean：" + userByType);

        // 根据 id 和类型获取 bean
        User userByIdAndType = context.getBean("user", User.class);
        System.out.println("根据 id 和类型获取bean：" + userByIdAndType);
    }
}
