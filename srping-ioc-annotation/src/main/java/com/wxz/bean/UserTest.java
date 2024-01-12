package com.wxz.bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wxz
 * @date 15:42 2024/1/12
 */
public class UserTest
{
    /**
     * @author wxz
     * @date 15:42 2024/1/12
     */
    public static void main(String[] args)
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
    }
}
