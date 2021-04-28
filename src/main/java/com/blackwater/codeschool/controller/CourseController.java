package com.blackwater.codeschool.controller;

import com.blackwater.codeschool.entity.Result;
import com.blackwater.codeschool.service.CourseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author eatmans
 * @version 1.0
 * @date 2021/4/1
 */

@RestController
@RequestMapping("/api/v1")
@Api(tags = {"课表相关接口"}, value = "课表模块")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @ApiOperation(value = "根据班级Id获取全部课表", notes = "/course/软件1935")
    @GetMapping("/course")
    public Result<?> getCourseAll(@PathVariable(name = "clazzId") String clazzId){
        return courseService.getCourseAll();
    }


    @ApiOperation(value = "根据班级Id获取全部课表", notes = "/course/软件1935")
    @GetMapping("/course/{clazzId}")
    public Result<?> getCourseByClassId(@PathVariable(name = "clazzId") String clazzId){
        return courseService.getCourseByClassId(clazzId);
    }

//    @ApiOperation(value = "根据星期几和班级Id获取全部课表", notes = "/course/2/软件1935")
//    @GetMapping("/course/{week}/{clazzId}")
//    public Result<?> getCourseBytWeekAndClazzId(@PathVariable(name = "clazzId") String clazzId,
//                                                           @PathVariable(name = "week") String week){
//        return courseService.getCourseBytWeekAndClazzId(week,clazzId);
//    }

    @ApiOperation(value = "根据周次和班级Id获取全部课表", notes = "/course/6-6/软件1935")
    @GetMapping("/course/{times}/{clazzId}")
    public Result<?> getCourseByTimesAndClazzId(@PathVariable(name = "clazzId") String clazzId,
                                                @PathVariable(name = "times") String times){
        return courseService.getCourseByTimesAndClazzId(times,clazzId);
    }

    @ApiOperation(value = "根据班第几周、星期几和级Id获取全部课表", notes = "/course/6-6/2/软件1935")
    @GetMapping("/course/{times}/{week}/{clazzId}")
    public Result<?> getCourseBytTimesAndWeekAndClazzId(
            @PathVariable(name = "times") String times,@PathVariable(name = "clazzId") String clazzId,
                                                   @PathVariable(name = "week") String week){
        return courseService.getCourseBytTimesAndWeekAndClazzId(times,week,clazzId);
    }

}
