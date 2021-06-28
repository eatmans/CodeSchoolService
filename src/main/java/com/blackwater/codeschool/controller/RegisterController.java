package com.blackwater.codeschool.controller;

import com.blackwater.codeschool.entity.Result;
import com.blackwater.codeschool.entity.Student;
import com.blackwater.codeschool.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author eatmans
 * @version 1.0
 * @date 2021/4/4
 */

@RestController
@RequestMapping("/api/v1/register")
@Api(tags = {"注册相关接口"}, value = "注册模块")
public class RegisterController {

    @Resource
    private StudentService studentService;

    @PostMapping("/uid")
    @ApiOperation(value = "通过Uid添加学生", notes = "无")
    public Result<?> addStudentByUid(@RequestBody Student student) {
        return studentService.addStudentByUid(student);
    }

    @PostMapping("/phone")
    @ApiOperation(value = "通过手机号码添加学生", notes = "无")
    public Result<?> addStudentByPhone(@RequestBody Student student) {
        return studentService.addStudentByPhone(student);
    }

}
