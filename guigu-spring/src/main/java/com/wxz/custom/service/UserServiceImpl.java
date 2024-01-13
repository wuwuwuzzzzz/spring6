package com.wxz.custom.service;

import com.wxz.custom.anno.Bean;
import com.wxz.custom.anno.Di;
import com.wxz.custom.dao.UserDao;

/**
 * @author wxz
 * @date 20:05 2024/1/12
 */
@Bean
public class UserServiceImpl implements UserService
{
    @Di
    private UserDao userDao;

    /**
     * add
     *
     * @author wxz
     * @date 21:29 2024/1/13
     */
    @Override
    public void add()
    {
        System.out.println("service add");
        userDao.add();
    }
}
