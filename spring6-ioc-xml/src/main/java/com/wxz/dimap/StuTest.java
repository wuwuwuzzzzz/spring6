package com.wxz.dimap;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wxz
 * @date 15:24 2024/1/11
 */
public class StuTest
{
    /**
     * @author wxz
     * @date 19:58 2024/1/11
     */
    @Test
    public void testStu()
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-dimap.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println(student);
    }

    /**
     * @author wxz
     * @date 19:58 2024/1/11
     */
    @Test
    public void testRef()
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-diref.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println(student);
    }

    /**
     * @author wxz
     * @date 19:58 2024/1/11
     */
    @Test
    public void testP()
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-diref.xml");
        Student student = context.getBean("student2", Student.class);
        System.out.println(student);
    }
}
