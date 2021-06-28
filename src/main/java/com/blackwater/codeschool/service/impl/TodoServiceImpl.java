package com.blackwater.codeschool.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.blackwater.codeschool.entity.Result;
import com.blackwater.codeschool.entity.ResultCode;
import com.blackwater.codeschool.entity.Todo;
import com.blackwater.codeschool.mapper.TodoMapper;
import com.blackwater.codeschool.service.TodoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author eatmans
 * @version 1.0
 * @date 2021/4/4
 */
@Service
public class TodoServiceImpl implements TodoService {

    @Resource
    private TodoMapper todoMapper;

    @Override
    public Result<?> getTodoAll() {
        return Result.success(ResultCode.SUCCESS, todoMapper.selectList(null));
    }

    @Override
    public Result<?> getTodoAllByUid(Integer uid) {

        if (uid == null) {
            return Result.error(ResultCode.DATA_EXCEPTION);
        }
        QueryWrapper<Todo> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("uid", uid);

        return Result.success(ResultCode.SUCCESS, queryWrapper);
    }

    @Override
    public Result<?> deleteTodoById(Integer id) {
        if (id == null) {
            return Result.error(ResultCode.DATA_EXCEPTION);
        }
        if (todoMapper.deleteById(id) > 0) {
            return Result.success(ResultCode.SUCCESS);
        } else {
            return Result.success(ResultCode.DELETE_FAILED);
        }
    }

    @Override
    public Result<?> addTodo(Todo todo) {
        return Result.success(todoMapper.insert(todo));
    }
}
