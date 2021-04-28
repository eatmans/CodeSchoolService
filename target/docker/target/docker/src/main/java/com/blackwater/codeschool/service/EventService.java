package com.blackwater.codeschool.service;

import com.blackwater.codeschool.entity.Event;

import java.util.List;

/**
 * @author eatmans
 * @version 1.0
 * @date 2021/4/1
 */
public interface EventService {

    List<Event> getEventAll();

    List<Event> getEventByUid();

    String  addEvent();
}
