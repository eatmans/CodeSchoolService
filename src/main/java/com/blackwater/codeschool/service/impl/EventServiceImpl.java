package com.blackwater.codeschool.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.blackwater.codeschool.entity.Event;
import com.blackwater.codeschool.entity.Result;
import com.blackwater.codeschool.entity.ResultCode;
import com.blackwater.codeschool.mapper.EventMapper;
import com.blackwater.codeschool.service.EventService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author eatmans
 * @version 1.0
 * @date 2021/4/4
 */
@Service
public class EventServiceImpl implements EventService {

    @Resource
    private EventMapper eventMapper;

    @Override
    public Result<?> getEventAll() {
        return Result.success(eventMapper.selectList(null));
    }

    @Override
    public Result<?> getEventByUid(Integer uid) {
        if (uid == null) {
            return Result.error(ResultCode.DATA_EXCEPTION);
        }
        QueryWrapper<Event> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("uid", uid);
        return Result.success(eventMapper.selectList(queryWrapper));
    }

    @Override
    public Result<?> addEvent(Event event) {
        return Result.success(eventMapper.insert(event));
    }

    @Override
    public Result<?> deleteEventByUid(Integer id) {
        return Result.success(eventMapper.deleteById(id));
    }

}
