package com.example.demo.util;

/**
 * Created by liumin5 on 2017/10/16.
 */
public class JsonResult {

    private String code;
    private String message;
    private Object data;

    public JsonResult(){
        this.code = ResultCode.SUCCESS.getVal();
        this.message = ResultCode.SUCCESS.getMsg();
    }

    public JsonResult(ResultCode code){
        this.code = code.getVal();
        this.message = code.getMsg();
    }

    public JsonResult(ResultCode code, String message){
        this.code = code.getVal();
        this.message = message;
    }

    public JsonResult(ResultCode code, String message, Object data){
        this.code = code.getVal();
        this.message = message;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
