package com.yout.example.springboot.validation.demo.pojo;

import java.util.List;

import javax.validation.constraints.*;

import com.yout.example.springboot.validation.demo.validator.AvatarUrl;
import com.yout.example.springboot.validation.demo.validator.Views;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: 学生模型
 * @author: linling
 * @date: 2020-08-20
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Null(groups = Views.OnCreate.class)
    @NotNull(groups = Views.OnUpdate.class)
    private int id;

    @NotEmpty(message = "姓名不能为空")
    private String name;

    @Min(value = 3, message = "3岁以下小朋友就别过来")
    @Max(value = 60, message = "60岁以上老爷爷也别过来")
    private int age;

    @Size(min = 2, message = "至少要有二个喜好")
    private List<String> favorite;

    @AvatarUrl(message = "头像链接格式不正确")
    private String avatar;
}
