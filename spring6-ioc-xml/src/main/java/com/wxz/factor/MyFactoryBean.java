package com.wxz.factor;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author wxz
 * @date 14:50 2024/1/12
 */
public class MyFactoryBean implements FactoryBean<User>
{
    /**
     * @return com.wxz.factor.User
     * @author wxz
     * @date 14:51 2024/1/12
     */
    @Override
    public User getObject() throws Exception
    {
        return new User();
    }

    /**
     * @return java.lang.Class<?>
     * @author wxz
     * @date 14:51 2024/1/12
     */
    @Override
    public Class<?> getObjectType()
    {
        return User.class;
    }
}
