package com.yout.example.springboot.validation.demo.pojo;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

/**
 * @author linling
 */
@Data
public class ValidationErrorResponse {
    private List<ValidateResult> validateResults = new ArrayList<>();
}