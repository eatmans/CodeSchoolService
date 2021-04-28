package com.blackwater.codeschool.mapper;

import com.blackwater.codeschool.entity.Todo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author eatmans
 * @version 1.0
 * @date 2021/4/4
 */
public interface TodoMapper {

    @Select("select * from todo_t")
    List<Todo> getTodoAll();

    @Insert("insert into todo_t(uid, content) " +
            "VALUES(#{uid}, #{content})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void addTodoByUid(Todo todo);
}
