package com.wxz.life;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wxz
 * @date 20:53 2024/1/11
 */
public class UserTest
{
    /**
     * @author wxz
     * @date 20:54 2024/1/11
     */
    @Test
    public void testUser()
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-life.xml");
        User user = context.getBean("user", User.class);
        System.out.println("6 bean 对象创建完成");
        System.out.println(user);
        context.close();
    }
}
