package com.blackwater.codeschool.service.impl;

import com.blackwater.codeschool.entity.Event;
import com.blackwater.codeschool.mapper.EventMapper;
import com.blackwater.codeschool.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author eatmans
 * @version 1.0
 * @date 2021/4/4
 */
@Service
public class EventServiceImpl implements EventService {

    @Autowired
    EventMapper eventMapper;

    @Override
    public List<Event> getEventAll() {
        return eventMapper.getEventAll();
    }

    @Override
    public List<Event> getEventByUid() {
        return null;
    }

    @Override
    public String addEvent() {
        return null;
    }
}
