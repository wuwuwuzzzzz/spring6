package com.wxz.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author wxz
 * @date 20:56 2024/1/11
 */
public class MyBeanPost implements BeanPostProcessor
{
    /**
     * @param bean     bean
     * @param beanName beanName
     * @return java.lang.Object
     * @author wxz
     * @date 20:57 2024/1/11
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException
    {
        System.out.println("3 bean后置处理器，初始化之前执行");
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    /**
     * @param bean     bean
     * @param beanName beanName
     * @return java.lang.Object
     * @author wxz
     * @date 20:57 2024/1/11
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException
    {
        System.out.println("5 bean后置处理器，初始化之后执行");
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
