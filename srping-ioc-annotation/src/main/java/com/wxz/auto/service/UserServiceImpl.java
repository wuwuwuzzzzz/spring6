package com.wxz.auto.service;

import com.wxz.auto.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wxz
 * @date 15:51 2024/1/12
 */
@Service
public class UserServiceImpl
{
    @Autowired
    private UserDao userDao;
}
