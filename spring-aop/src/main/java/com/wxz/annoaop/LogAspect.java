package com.wxz.annoaop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author wxz
 * @date 13:26 2024/1/14
 */
@Component
@Aspect
public class LogAspect
{
    /**
     * 前置通知
     *
     * @author wxz
     * @date 13:32 2024/1/14
     */
    @Before("execution(public int com.wxz.annoaop.CalculatorImpl.*(..))")
    public void beforeMethod()
    {
        System.out.println("[日志] CalculatorImpl 中的方法开始了");
    }
}
