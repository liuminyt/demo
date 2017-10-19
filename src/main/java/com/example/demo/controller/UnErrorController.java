package com.example.demo.controller;

import com.example.demo.util.JsonResult;
import com.example.demo.util.ResultCode;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by liumin5 on 2017/10/17.
 */
@Controller
@RequestMapping("${server.error.path:${error.path:/error}}")
public class UnErrorController implements ErrorController {
    @Override
    public String getErrorPath() {
        return "/error";
    }

    @RequestMapping
    @ResponseBody
    public JsonResult doHandlerError(){
        return new JsonResult(ResultCode.UNKNOWN_ERROR);
    }
}
