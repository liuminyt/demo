package com.example.demo.controller;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by liumin5 on 2017/10/16.
 */
@Controller
@EnableAutoConfiguration
public class UserController {

    @Autowired
    private UserService userService;

    @Value("${my.name}")
    private String myName;

    @RequestMapping("/w")
    @ResponseBody
    String welcome() {
        StringBuilder sb = new StringBuilder();
        sb.append("welcome my first spring boot project");
        sb.append("\n");
        sb.append(myName);

        return sb.toString();
    }

    @RequestMapping("/notVerify")
    @ResponseBody
    String notVerify(){
        return "username or password error!!";
    }



}
