package com.yout.example.springboot.validation.demo.validator;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Validator;

import org.springframework.stereotype.Service;

import com.yout.example.springboot.validation.demo.pojo.Student;

/**
 * @description:
 * @author: linling
 * @date: 2020-08-21
 */
@Service
public class SpringBasedProgrammaticallyValidatingService {

    private Validator validator;

    SpringBasedProgrammaticallyValidatingService(Validator validator) {
        this.validator = validator;
    }

    void validateStudent(Student student) {
        Set<ConstraintViolation<Student>> violations = validator.validate(student);
        if (!violations.isEmpty()) {
            throw new ConstraintViolationException(violations);
        }
    }
}
