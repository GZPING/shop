package com.shopping.controller;

import com.shopping.domain.User;
import com.shopping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by GD on 2017/8/31.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    private User user;

    @RequestMapping("/login")
    public User login(){
        try {
            user = userService.loginUser(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
}
