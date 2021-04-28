package com.blackwater.codeschool.mapper;

import com.blackwater.codeschool.entity.Event;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author eatmans
 * @version 1.0
 * @date 2021/4/1
 */
public interface EventMapper {

    @Select("select * from event_t")
    List<Event> getEventAll();

}
