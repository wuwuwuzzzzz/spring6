package com.wxz.custom.dao;

import com.wxz.custom.anno.Bean;

/**
 * @author wxz
 * @date 20:05 2024/1/12
 */
@Bean
public class UserDaoImpl implements UserDao
{
    /**
     * add
     *
     * @author wxz
     * @date 21:28 2024/1/13
     */
    @Override
    public void add()
    {
        System.out.println("dao add");
    }
}
