package com.blackwater.codeschool.mapper;

import com.blackwater.codeschool.entity.Event;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author eatmans
 * @version 1.0
 * @date 2021/4/1
 */

@Component
public interface EventMapper{

    @Select("select * from event_t")
    List<Event> getEventAll();

}
