package com.example.demo.domain;

import com.example.demo.common.Phone;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Pattern;

/**
 * Created by liumin5 on 2017/10/17.
 */
public class UserModel {

    private String name;
    private String password;

    public UserModel() {
    }

    public UserModel(String name, String password) {

        this.name = name;
        this.password = password;
    }

    //1
//    @NotBlank(message = "用户名不能为空")
//    @Pattern(
//            regexp = "1(([38]\\d)|(5[^4&&\\d])|(4[579])|(7[0135678]))\\d{8}",
//            message = "手机号格式不合法"
//    )
    @Phone
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    @NotBlank(message = "密码不能为空")
    @Length(min = 6, message = "密码长度不能小于6位")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
