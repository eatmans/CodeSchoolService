package com.blackwater.codeschool.controller;

import com.blackwater.codeschool.entity.Result;
import com.blackwater.codeschool.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author eatmans
 * @version 1.0
 * @date 2021/3/31
 */
@RestController
@RequestMapping("/api/v1/student")
@Api(tags = {"学生相关接口"}, value = "学生模块")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @ApiOperation(value = "根据学号获取学生信息", notes = "无")
    @GetMapping("/uid/{uid}")
    public Result<?> getStudentByUid(@PathVariable(name = "uid") Integer uid) {
        return studentService.getStudentByUid(uid);
    }

    @ApiOperation(value = "根据手机号码获取学生信息", notes = "无")
    @GetMapping("/phone/{phonenumber}")
    public Result<?> getStudentByPhoneNumber(@PathVariable(name = "phonenumber") String phonenumber) {
        return studentService.getStudentByPhoneNumber(phonenumber);
    }

    @ApiOperation(value = "根据手机号码获取找回密码", notes = "无")
    @GetMapping("/find/{phonenumber}")
    public Result<?> findStudentByPhoneNumber(@PathVariable(name = "phonenumber") String phonenumber) {
        return studentService.getStudentByPhoneNumber(phonenumber);
    }

}
