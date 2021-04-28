package com.blackwater.codeschool.service;

import com.blackwater.codeschool.entity.Result;
import com.blackwater.codeschool.entity.Todo;

import java.util.List;

/**
 * @author eatmans
 * @version 1.0
 * @date 2021/4/4
 */
public interface TodoService {

    Result<?> getTodoAll();

    Result<?> getTodoAllByUid();

    Result<?> addTodo();


}
