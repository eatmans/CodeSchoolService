package com.blackwater.codeschool.controller;

import com.blackwater.codeschool.entity.Result;
import com.blackwater.codeschool.service.TodoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author eatmans
 * @version 1.0
 * @date 2021/4/1
 */
@RestController
@RequestMapping("/api/v1/todo")
@Api(tags = {"Todo相关接口"}, value = "Todo模块")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @ApiOperation(value = "获取所有TODO")
    @GetMapping("/")
    public Result<?> getTodoAll(){
        return todoService.getTodoAll();
    }

    @ApiOperation(value = "通过UID来获取用户所有TODO")
    @GetMapping("/uid")
    public Result<?> getTodoAllByUid(String uid){
        return todoService.getTodoAll();
    }

    @ApiOperation(value = "通过Phone获取所有TODO", notes = "无")
    @GetMapping("/phone")
    public Result<?> getTodoAllByPhone(String phone){
        return todoService.getTodoAll();
    }
}
