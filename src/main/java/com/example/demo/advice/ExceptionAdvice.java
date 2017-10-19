package com.example.demo.advice;

import com.example.demo.util.JsonResult;
import com.example.demo.util.ResultCode;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by liumin5 on 2017/10/19.
 */
//@ControllerAdvice
//@ResponseBody
@RestControllerAdvice
public class ExceptionAdvice {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public JsonResult handleIllegalParamException(MethodArgumentNotValidException e){
        List<ObjectError> errors = e.getBindingResult().getAllErrors();
        String tips = "参数不合法";
        if (errors.size() > 0){
            tips = errors.get(0).getDefaultMessage();
        }
        e.printStackTrace();
        return new JsonResult(ResultCode.EXCEPTION, tips);
    }

    @ExceptionHandler(Exception.class)
    public JsonResult handleException(Exception e, HttpServletRequest request){
        e.printStackTrace();
        return new JsonResult(ResultCode.UNKNOWN_ERROR, "unkonw error");
    }
}
