package com.wxz.ditest;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wxz
 * @date 14:44 2024/1/11
 */
public class EmpTest
{
    /**
     * @author wxz
     * @date 14:45 2024/1/11
     */
    @Test
    public void testEmp()
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-ditest.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }

    /**
     * @author wxz
     * @date 14:50 2024/1/11
     */
    @Test
    public void testEmp2()
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-ditest.xml");
        Emp emp = context.getBean("emp2", Emp.class);
        System.out.println(emp);
    }

    /**
     * @author wxz
     * @date 14:50 2024/1/11
     */
    @Test
    public void testEmp3()
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-ditest.xml");
        Emp emp = context.getBean("emp3", Emp.class);
        System.out.println(emp);
    }

    /**
     * @author wxz
     * @date 14:50 2024/1/11
     */
    @Test
    public void testEmp4()
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-diarray.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }

    /**
     * @author wxz
     * @date 15:08 2024/1/11
     */
    @Test
    public void testEmp5()
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-dilist.xml");
        Dept dept = context.getBean("dept", Dept.class);
        dept.info();
    }
}
