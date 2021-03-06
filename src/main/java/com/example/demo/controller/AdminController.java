package com.example.demo.controller;

import com.example.demo.domain.Entity;
import com.example.demo.domain.UserModel;
import com.example.demo.util.JsonResult;
import com.example.demo.util.ResultCode;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
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

    @RequestMapping("/login2")
    public JsonResult login2(@RequestBody Entity entity){
        return new JsonResult(ResultCode.SUCCESS, "ok !!!", entity);
    }

    @RequestMapping("/login4")
    public JsonResult login4(@RequestBody @Valid  UserModel userModel){
        Entity entity = new Entity();
        entity.setName(userModel.getName());
        entity.setPassword(userModel.getPassword());

        return new JsonResult(ResultCode.SUCCESS, "ok !!!", entity);
    }
}
