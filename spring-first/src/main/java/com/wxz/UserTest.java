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
}
