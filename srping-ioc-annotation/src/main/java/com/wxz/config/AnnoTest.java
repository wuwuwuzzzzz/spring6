package com.wxz.config;

import com.wxz.auto.controller.UserController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wxz
 * @date 16:25 2024/1/12
 */
public class AnnoTest
{
    /**
     * @author wxz
     * @date 16:25 2024/1/12
     */
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserController userController = context.getBean(UserController.class);
        System.out.println(userController);
    }
}
