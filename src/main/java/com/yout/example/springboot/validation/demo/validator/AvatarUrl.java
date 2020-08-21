package com.yout.example.springboot.validation.demo.validator;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * @description: 头像地址验证器
 * @author: linling
 * @date: 2020-08-21
 */
@Target({FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = AvatarValidator.class)
@Documented
public @interface AvatarUrl {

    String message() default "{AvatarUrl.invalid}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}