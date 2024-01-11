package com.wxz.dimap;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wxz
 * @date 15:24 2024/1/11
 */
public class StuTest
{
    @Test
    public void testStu()
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-dimap.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println(student);
    }
}
