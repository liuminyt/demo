package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by liumin5 on 2017/9/11.
 */
@Controller
public class IndexController {

    @RequestMapping({"/", "/index"})
    @ResponseBody
    public String index(){
        return "hello world";
    }

    @RequestMapping(value = "/profile/{groupId}/{userId}")
    @ResponseBody
    public String profile(@PathVariable("groupId") String groupId,
                          @PathVariable("userId") int userId,
                          @RequestParam(value = "type",defaultValue = "1") int type,
                          @RequestParam(value = "key", defaultValue = "bupt") String key){


        return String.format("{%s},{%d},{%d},{%s}", groupId, userId, type, key) ;
    }


    public String request(HttpServletRequest request, HttpServletResponse response, HttpSession session){

        StringBuilder sb = new StringBuilder();
        return  null;
    }

}
