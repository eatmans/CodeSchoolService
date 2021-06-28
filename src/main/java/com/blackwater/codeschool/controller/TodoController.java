package com.blackwater.codeschool.controller;

import com.blackwater.codeschool.entity.Result;
import com.blackwater.codeschool.entity.Todo;
import com.blackwater.codeschool.service.TodoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author eatmans
 * @version 1.0
 * @date 2021/4/1
 */
@RestController
@RequestMapping("/api/v1/todo")
@Api(tags = {"Todo相关接口"}, value = "Todo模块")
public class TodoController {

    @Resource
    private TodoService todoService;

    @ApiOperation(value = "获取所有TODO")
    @GetMapping("/")
    public Result<?> getTodoAll() {
        return todoService.getTodoAll();
    }

    @ApiOperation(value = "通过学号UID来获取用户所有TODO")
    @GetMapping("/uid")
    public Result<?> getTodoAllByUid(Integer uid) {
        return todoService.getTodoAllByUid(uid);
    }

    @ApiOperation(value = "通过Phone获取所有TODO", notes = "无")
    @GetMapping("/phone")
    public Result<?> getTodoAllByPhone(String phone) {
        return todoService.getTodoAll();
    }

    @ApiOperation(value = "根据id删除事件", notes = "无")
    @DeleteMapping("/del")
    public Result<?> deleteTodoById(Integer id) {
        return todoService.deleteTodoById(id);
    }

    @ApiOperation(value = "根据手机号码获取学生信息", notes = "无")
    @PostMapping("/add")
    public Result<?> addTodo(Todo todo) {
        return todoService.addTodo(todo);
    }
}
