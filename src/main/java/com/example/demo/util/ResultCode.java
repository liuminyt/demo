package com.example.demo.util;

/**
 * Created by liumin5 on 2017/10/16.
 */
public enum ResultCode {
    SUCCESS("200", "成功"),

    NOT_LOGIN("400", "没有登录"),

    EXCEPTION("401", "发生异常"),

    SYS_ERROR("402", "系统错误"),

    PARAMS_ERROR("403", "参数错误"),

    NOT_SUPPORTED("410", "废弃"),

    INVALID_AUTHCODE("444", "无效的AuthCode"),

    TOO_FREQUENT("445", "频繁调用"),

    UNKNOWN_ERROR("499", "未知错误");


    private String val;
    private String msg;

    private ResultCode(String val, String msg) {
        this.val = val;
        this.msg = msg;
    }

    public String getVal() {
        return val;
    }

    public String getMsg() {
        return msg;
    }
}
