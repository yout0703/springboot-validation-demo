package com.yout.example.springboot.validation.demo.controller;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.yout.example.springboot.validation.demo.pojo.Student;
import com.yout.example.springboot.validation.demo.service.StudentService;

/**
 * @description: Spring Boot Validation测试
 * @author: linling
 * @date: 2020-08-20
 */
@RestController
@Validated
@RequestMapping("/validation")
public class ValidationTestController {

    private final StudentService studentService;

    public ValidationTestController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/example1")
    String validateExample1(@NotEmpty(message = "不可以为空") @RequestParam String param) {
        return "valid";
    }

    @GetMapping("/example2/{id}")
    String validateExample2(@Min(value = 10, message = "ID不能小于10") @PathVariable String id) {
        return "valid";
    }

    @PostMapping("/example3/")
    String validateExample2(@RequestBody @Valid Student student) {
        return "valid";
    }

    @GetMapping("/example4/")
    String validateExample4() {
        Student student = Student.builder().name("").age(2).favorite(List.of("reading")).build();
        studentService.addStudent(student);
        return "valid";
    }

//    @ExceptionHandler(ConstraintViolationException.class)
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    String handleConstraintViolationException(ConstraintViolationException e) {
//        return "400 BAD REQUEST";
//    }
}
