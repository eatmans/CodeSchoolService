package com.blackwater.codeschool.service;

import com.blackwater.codeschool.entity.Event;
import com.blackwater.codeschool.entity.Result;


/**
 * @author eatmans
 * @version 1.0
 * @date 2021/4/1
 */
public interface EventService {

    Result<?> getEventAll();

    Result<?> getEventByUid(Integer uid);

    Result<?> addEvent(Event event);

    Result<?> deleteEventByUid(Integer id);
}
