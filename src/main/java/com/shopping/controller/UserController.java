package com.shopping.controller;

import com.shopping.domain.User;
import com.shopping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by GD on 2017/8/31.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    private User user;
    @Value("${USER_SESSION}")
    private String userSession;

    @RequestMapping("/login")
    public User login(HttpServletRequest request, HttpServletRequest response){
        try {
            user = userService.loginUser(1);
            HttpSession session = request.getSession();
            session.setAttribute(userSession,user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
}
