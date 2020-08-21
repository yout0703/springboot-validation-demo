package com.yout.example.springboot.validation.demo.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.yout.example.springboot.validation.demo.pojo.Student;
import com.yout.example.springboot.validation.demo.validator.Views;

/**
 * @description: 学生服务
 * @author: linling
 * @date: 2020-08-21
 */
@Service
@Validated
public class StudentService {

    @Validated(Views.OnCreate.class)
    public void addStudent(@Valid Student student) {
        // add student
    }

    @Validated(Views.OnUpdate.class)
    public void updateStudent(@Valid Student student) {
        // update student
    }
}
