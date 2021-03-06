package com.blackwater.codeschool.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.blackwater.codeschool.entity.Course;
import com.blackwater.codeschool.entity.Result;
import com.blackwater.codeschool.entity.ResultCode;
import com.blackwater.codeschool.mapper.CourseMapper;
import com.blackwater.codeschool.service.CourseService;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author eatmans
 * @version 1.0
 * @date 2021/4/3
 */
@Service
public class CourseServiceImpl implements CourseService {

    @Resource
    private CourseMapper courseMapper;

    @Override
    public Result<?> getCourseAll() {
        return Result.success(courseMapper.getCourseAll());
    }

    @Override
    public Result<?> getCourseByUid(Integer uid) {
        if (uid == null) {
            return Result.error(ResultCode.DATA_EXCEPTION);
        }
        QueryWrapper<Course> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("uid", uid);
        return Result.success(courseMapper.selectList(queryWrapper));
    }

    @Override
    @ApiOperation(value = "获取课表列表", notes = "根据班级获取")
    public Result<?> getCourseByClassId(String clazzId) {
        return Result.success(courseMapper.getCourseByClassId(clazzId));
    }

    @Override
    public Result<?> getCourseBytTimes(String times) {
        return null;
    }

    @Override
    public Result<?> getCourseByWeek(Integer week) {
        return null;
    }


    @Override
    public Result<?> getCourseByTimesAndClazzId(String times, String clazzId) {
        return Result.success(courseMapper.getCourseByTimesAndClazzId(times, clazzId));
    }

    @Override
    public Result<?> getCourseBytTimesAndWeek(String times, Integer week) {
        return Result.success(courseMapper.getCourseBytTimesAndWeek(times, week));
    }

    @Override
    public Result<?> getCourseBytWeekAndClazzId(String week, String clazzId) {
        return Result.success(courseMapper.getCourseBytWeekAndClazzId(week, clazzId));
    }

    @Override
    public Result<?> getCourseBytTimesAndWeekAndClazzId(String times, String week, String clazzId) {
        return Result.success(courseMapper.getCourseBytTimesAndWeekAndClazzId(times, week, clazzId));
    }

}
