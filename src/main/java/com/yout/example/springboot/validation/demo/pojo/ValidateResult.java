package com.yout.example.springboot.validation.demo.pojo;

import lombok.Data;

/**
 * @author linling
 */
@Data
public class ValidateResult {
    private final String fieldName;
    private final String message;
}