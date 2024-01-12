package com.wxz.auto.controller;

import com.wxz.auto.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author wxz
 * @date 15:52 2024/1/12
 */
@Controller
public class UserController
{
    @Autowired
    private UserService userService;
}
