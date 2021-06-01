package com.blackwater.codeschool.mapper;

import com.blackwater.codeschool.entity.Course;
import com.blackwater.codeschool.entity.Result;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author eatmans
 * @version 1.0
 * @date 2021/4/1
 */
@Component
public interface CourseMapper<T> {

    //查找全部课程
    @Select("select * from course_t")
    List<Course> getCourseAll();

    // 根据学号查找课程
    List<Course> getCourseByUid();

    // 根据班级ID查找课程
    @Select("select * from course_t where clazz_id like concat('%', #{clazzId},'%') ")
    List<Course> getCourseByClassId(@Param("clazzId") String clazzId);

    // 根据周次来查询课程
    @Select("select * from course_t where times = #{times} ")
    List<Course> getCourseBytTimes(String times);

    // 根据星期来查询课程
    @Select("select * from course_t where week = #{week} ")
    List<Course> getCourseByWeek(Integer week);

    // 根据周次和星期来查询课程
    @Select("select * from course_t where times = #{times} and week = #{week}")
    List<Course> getCourseBytTimesAndWeek(String times, Integer week);

    // 根据周次和班级来查询课程
    @Select("select * from course_t where times = #{times} and clazz_id = #{clazzId} order by week, section")
    List<Course>  getCourseByTimesAndClazzId(@Param("times") String times,@Param("clazzId") String clazzId);

    // 根据星期和班级来查询课程
    @Select("select * from course_t where week = #{week} and clazz_id like concat('%', #{clazzId},'%') ")
    List<Course> getCourseBytWeekAndClazzId(@Param("week") String week,@Param("clazzId") String clazzId);

    // 根据周次、星期和班级ID来查询课程
    @Select("select * from course_t where times = #{times} and week = #{week} and clazz_id like concat('%', #{clazzId},'%') ")
    List<Course> getCourseBytTimesAndWeekAndClazzId(@Param("times") String times,@Param("week") String week,@Param("clazzId") String clazzId);

}
