package com.shopping.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by GD on 2017/8/31.
 */
@Controller
@EnableAutoConfiguration
public class HelloController {

    @RequestMapping(path = "/hello")
    @ResponseBody
    public String index(){
        return "Hello World";
    }
}
