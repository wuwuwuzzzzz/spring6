package com.wxz.xmlaop;

import lombok.extern.java.Log;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author wxz
 * @date 13:26 2024/1/14
 */
@Component
@Aspect
@Log
public class LogAspect
{
    /**
     * 前置通知
     *
     * @param joinPoint joinPoint
     * @author wxz
     * @date 14:18 2024/1/14
     */
    public void beforeMethod(JoinPoint joinPoint)
    {
        String name = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("Logger ---> 前置通知，方法名称：" + name + "，参数是：" + Arrays.toString(args));
    }

    /**
     * 后置通知
     *
     * @param joinPoint joinPoint
     * @author wxz
     * @date 14:18 2024/1/14
     */
    public void afterMethod(JoinPoint joinPoint)
    {
        String name = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("Logger ---> 后置通知，方法名称：" + name + "，参数是：" + Arrays.toString(args));
    }

    /**
     * 返回通知
     *
     * @param joinPoint joinPoint
     * @param result    result
     * @author wxz
     * @date 14:18 2024/1/14
     */
    public void afterReturningMethod(JoinPoint joinPoint, Object result)
    {
        String name = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("Logger ---> 返回通知，方法名称：" + name + "，参数是：" + Arrays.toString(args) + "，结果是：" + result);
    }

    /**
     * 异常通知
     *
     * @param joinPoint joinPoint
     * @param e         e
     * @author wxz
     * @date 14:21 2024/1/14
     */
    public void afterThrowingMethod(JoinPoint joinPoint, Throwable e)
    {
        String name = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("Logger ---> 异常通知，方法名称：" + name + "，参数是：" + Arrays.toString(args) + "，异常是：" + e);
    }

    /**
     * 环绕通知
     *
     * @param joinPoint joinPoint
     * @return java.lang.Object
     * @author wxz
     * @date 14:31 2024/1/14
     */
    public Object aroundMethod(ProceedingJoinPoint joinPoint)
    {
        Object result = null;
        try
        {
            System.out.println("环绕通知 ---> 目标对象方法执行之前");
            // 目标对象（连接点）方法的执行
            result = joinPoint.proceed();
            System.out.println("环绕通知 --> 目标对象方法返回值之后");
        } catch (Throwable e)
        {
            log.warning("环绕通知 --> 目标对象方法出现异常时");
        } finally
        {
            System.out.println("环绕通知 --> 目标对象方法执行完毕");
        }
        return result;
    }
}
