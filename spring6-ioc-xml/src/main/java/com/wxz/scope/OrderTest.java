package com.wxz.scope;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wxz
 * @date 20:40 2024/1/11
 */
public class OrderTest
{
    /**
     * @author wxz
     * @date 20:41 2024/1/11
     */
    @Test
    public void testOrder()
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-scope.xml");
        Order order = context.getBean(Order.class);
        Order order1 = context.getBean(Order.class);
        System.out.println(order == order1);
    }
}
