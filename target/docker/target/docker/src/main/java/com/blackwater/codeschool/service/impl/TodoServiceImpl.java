package com.blackwater.codeschool.service.impl;

import com.blackwater.codeschool.entity.Result;
import com.blackwater.codeschool.entity.ResultCode;
import com.blackwater.codeschool.mapper.TodoMapper;
import com.blackwater.codeschool.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author eatmans
 * @version 1.0
 * @date 2021/4/4
 */
@Service
public class TodoServiceImpl implements TodoService {

    @Autowired
    private TodoMapper todoMapper;

    @Override
    public Result<?> getTodoAll() {
        return Result.success(ResultCode.SUCCESS, todoMapper.getTodoAll()) ;
    }

    @Override
    public Result<?> getTodoAllByUid() {
        return Result.success(ResultCode.SUCCESS, todoMapper.getTodoAll());
    }

    @Override
    public Result<?> addTodo() {
        return null;
    }
}
