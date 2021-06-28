package com.blackwater.codeschool.service;

import com.blackwater.codeschool.entity.Course;
import com.blackwater.codeschool.entity.Result;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author eatmans
 * @version 1.0
 * @date 2021/4/3
 */
public interface CourseService {

    //查找全部课程
    Result<?> getCourseAll();

    // 根据学号查找课程
    Result<?> getCourseByUid(Integer uid);

    // 根据班级ID查找课程
    Result<?> getCourseByClassId(String clazzId);

    // 根据周次来查询课程
    Result<?> getCourseBytTimes(String times);

    // 根据星期来查询课程
    Result<?> getCourseByWeek(Integer week);

    // 根据周次和星期来查询课程
    Result<?> getCourseBytTimesAndWeek(String times, Integer week);

    Result<?> getCourseByTimesAndClazzId(String times, String clazzId);

    // 根据星期和班级来查询课程
    Result<?> getCourseBytWeekAndClazzId(String week, String clazzId);

    // 根据周次、星期和班级ID来查询课程
    Result<?> getCourseBytTimesAndWeekAndClazzId(String times, String week, String clazzId);

}
