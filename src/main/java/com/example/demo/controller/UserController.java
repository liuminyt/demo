package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @RequestMapping("/login3")
    String login(Model model){
        model.addAttribute("user", new User());
        return "login";
    }

    @RequestMapping("/register")
    String register(Model model){
        model.addAttribute("user", new User());
        return "register";
    }

    @RequestMapping(value = "/registerUser", method = RequestMethod.POST)
    @ResponseBody
    String registerUser(User user, Model model){
        return userService.registerUser(user);
    }

    @RequestMapping(value = "/userLogin", method = RequestMethod.POST)
    String userLogin(User user, Model model){
        boolean verify = userService.verifyUser(user);
        if (verify){
            model.addAttribute("name", user.getName());
            model.addAttribute("password", user.getPassword());
            return "result";
        }else {
            return "redirect:/notVerify";
        }
    }



}
