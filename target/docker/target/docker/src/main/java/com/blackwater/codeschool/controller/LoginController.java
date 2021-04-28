package com.blackwater.codeschool.controller;

import com.blackwater.codeschool.entity.Result;
import com.blackwater.codeschool.entity.Student;
import com.blackwater.codeschool.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author eatmans
 * @version 1.0
 * @date 2021/4/4
 */

@RestController
@RequestMapping("/api/v1/login")
@Api(tags = {"登录相关接口"}, value = "登录模块")
public class LoginController {

    @Autowired
    private StudentService studentService;
    @ApiOperation(value = "使用学号和密码登录", notes = "无")
    @GetMapping("/uid")
    public Result<?> loginByUidAndPassword(@RequestBody Student student){
        return studentService.getStudentByUidAndPassword(student.getUid(),student.getPassword());
    }

    @ApiOperation(value = "使用手机号码和密码登录", notes = "无")
    @PostMapping("/phone")
    public Result<?> loginByPhoneNumberAndPassword(@RequestBody Student student){
        return studentService.loginByPhoneNumberAndPassword(student.getPhoneNumber(), student.getPassword());
    }
}
