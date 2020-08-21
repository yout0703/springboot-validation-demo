package com.yout.example.springboot.validation.demo.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.util.StringUtils;

/**
 * @description: 头像地址验证器
 * @author: linling
 * @date: 2020-08-21
 */
public class AvatarValidator implements ConstraintValidator<AvatarUrl, String> {

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (StringUtils.isEmpty(value)) {
            return false;
        }
        if (!value.startsWith("http://") && !value.startsWith("https://")) {
            return false;
        }
        if (!value.endsWith(".jpg") && !value.endsWith(".png")) {
            return false;
        }
        return true;
    }
}
