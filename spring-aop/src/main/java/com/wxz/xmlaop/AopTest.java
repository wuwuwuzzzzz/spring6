package com.wxz.xmlaop;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wxz
 * @date 13:38 2024/1/14
 */
public class AopTest
{
    /**
     * @author wxz
     * @date 13:39 2024/1/14
     */
    @Test
    public void testAop()
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanaop.xml");
        Calculator calculator = context.getBean(Calculator.class);
        calculator.add(1, 0);
    }
}
