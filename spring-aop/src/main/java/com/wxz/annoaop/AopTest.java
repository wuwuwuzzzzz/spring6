package com.wxz.annoaop;

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
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Calculator calculator = context.getBean(Calculator.class);
        calculator.div(1, 0);
    }
}
