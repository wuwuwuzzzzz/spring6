package com.wxz;

import org.junit.jupiter.api.Test;

/**
 * @author wxz
 * @date 12:21 2024/1/14
 */
public class CalTest
{
    /**
     * @author wxz
     * @date 12:22 2024/1/14
     */
    @Test
    public void testCal()
    {
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator proxy = (Calculator) proxyFactory.getProxy();
        proxy.add(1, 1);
    }
}
