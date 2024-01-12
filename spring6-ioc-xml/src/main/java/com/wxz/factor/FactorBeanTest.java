package com.wxz.factor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wxz
 * @date 14:53 2024/1/12
 */
public class FactorBeanTest
{
    /**
     * @author wxz
     * @date 14:53 2024/1/12
     */
    public static void main(String[] args)
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-factorybean.xml");
        User user = (User) context.getBean("user");
        System.out.println(user);
    }
}
