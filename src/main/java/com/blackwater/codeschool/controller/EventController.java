package com.blackwater.codeschool.controller;

import com.blackwater.codeschool.entity.Event;
import com.blackwater.codeschool.entity.Result;
import com.blackwater.codeschool.service.EventService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author eatmans
 * @version 1.0
 * @date 2021/4/1
 */
@RestController
@RequestMapping("/api/v1/event")
@Api(tags = {"事件相关接口"}, value = "事件模块")
public class EventController {

    @Resource
    private EventService eventService;

    @ApiOperation(value = "获取所有事件", notes = "无")
    @GetMapping("/")
    public Result<?> getEventAll() {
        return eventService.getEventAll();
    }

    @ApiOperation(value = "根据uid获取事件", notes = "无")
    @GetMapping("/uid")
    public Result<?> getEventByUid(Integer uid) {
        return eventService.getEventByUid(uid);
    }

    @ApiOperation(value = "添加新的事件", notes = "无")
    @PostMapping("/add")
    public Result<?> addEvent(Event event) {
        return eventService.addEvent(event);
    }

    @ApiOperation(value = "根据id删除事件", notes = "无")
    @DeleteMapping("/del")
    public Result<?> deleteEventByUid(Integer id) {
        return eventService.deleteEventByUid(id);
    }
}
