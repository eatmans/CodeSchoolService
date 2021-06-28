package com.blackwater.codeschool.service;

import com.blackwater.codeschool.entity.Result;
import com.blackwater.codeschool.entity.Todo;

/**
 * @author eatmans
 * @version 1.0
 * @date 2021/4/4
 */
public interface TodoService {

    /**
     *  获取全部TODO
     * @return
     */
    Result<?> getTodoAll();

    /**
     * 根据学号获取TODO
     * @param uid
     * @return
     */
    Result<?> getTodoAllByUid(Integer uid);

    /**
     * 根据id删除TODO
     * @param id 自增加id
     * @return
     */
    Result<?> deleteTodoById(Integer id);

    /**
     *
     * @param todo
     * @return
     */
    Result<?> addTodo(Todo todo);

}
