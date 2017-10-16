package com.example.demo.controller;

import com.example.demo.util.JsonResult;
import com.example.demo.util.ResultCode;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Created by liumin5 on 2017/10/16.
 */

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    private String userName = "admin";
    private String password = "admin";

    @RequestMapping("/login")
    public JsonResult login(HttpServletRequest request, HttpServletResponse response, @RequestParam Map<String, String> map){
        if (userName.equals(map.get("userName")) && password.equals(map.get("password"))){
            return new JsonResult(ResultCode.SUCCESS, "ok !!!!", null);
        }else {
            return new JsonResult(ResultCode.NOT_LOGIN, "failed !!!!", null);
        }
    }
}
