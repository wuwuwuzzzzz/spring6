package com.wxz.di;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wxz
 * @date 12:09 2024/1/11
 */
public class BookTest
{
    /**
     * @author wxz
     * @date 12:10 2024/1/11
     */
    @Test
    public void testSetter()
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-di.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
    }
}
