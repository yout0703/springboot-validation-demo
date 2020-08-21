package com.yout.example.springboot.validation.demo.validator;

import java.util.Set;

import javax.validation.*;

import com.yout.example.springboot.validation.demo.pojo.Student;

class ProgrammaticallyValidatingService {
    void validateStudent(Student student) {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<Student>> violations = validator.validate(student);
        if (!violations.isEmpty()) {
            throw new ConstraintViolationException(violations);
        }
    }
}