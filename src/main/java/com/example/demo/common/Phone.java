package com.example.demo.common;

import com.example.demo.util.PhoneValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * Created by liumin5 on 2017/10/17.
 */
@Constraint(validatedBy = PhoneValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Phone {

    String message() default "手机号码格式不合法";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
