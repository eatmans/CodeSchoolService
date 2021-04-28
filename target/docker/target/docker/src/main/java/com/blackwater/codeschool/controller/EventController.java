package com.blackwater.codeschool.controller;


import com.blackwater.codeschool.entity.Event;
import com.blackwater.codeschool.service.EventService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author eatmans
 * @version 1.0
 * @date 2021/4/1
 */
@RestController
@RequestMapping("/api/v1/event")
@Api(tags = {"事件相关接口"}, value = "事件模块")
public class EventController {

    @Autowired
    private EventService eventService;

    @ApiOperation(value = "获取所有事件", notes = "无")
    @GetMapping("/")
    public List<Event> getEventAll(){
        return eventService.getEventAll();
    }
}
