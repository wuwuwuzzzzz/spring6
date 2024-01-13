package com.wxz.custom.bean;

/**
 * @author wxz
 * @date 20:08 2024/1/12
 */
public interface ApplicationContext
{
    /**
     * 返回对象
     *
     * @param clazz clazz
     * @return java.lang.Object
     * @author wxz
     * @date 20:09 2024/1/12
     */
    Object getBean(Class<?> clazz);
}
