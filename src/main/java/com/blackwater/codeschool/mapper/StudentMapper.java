package com.blackwater.codeschool.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.blackwater.codeschool.entity.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author eatmans
 * @version 1.0
 * @date 2021/4/1
 */

public interface StudentMapper extends BaseMapper<Student> {

    // 获取全部学生信息
    @Select("select * from student_t")
    List<Student> getStudentAll();

    // 根据班级id获取该班的全部学生
    @Select("select * from student_t where clazzId = #{clazzId}")
    List<Student> getStudentByClazzId(@Param("clazzId") String clazzId);

    // 根据学号获取学生信息
    @Select("select * from student_t where uid = #{uid}")
    Student getStudentByUid(Integer uid);

    // 根据手机号码获取学生信息
    @Select("select * from student_t where phone_Number = #{phoneNumber}")
    Student getStudentByPhoneNumber(String phoneNumber);

    // 根据学号和密码获取学生信息
    @Select("select * from student_t where uid = #{uid} and password = #{password}")
    Student getStudentByUidAndPassword(Integer uid, String password);

    // 根据
    @Select("select * from student_t where phone_number = #{phoneNumber} and password = #{password}")
    Student getStudentByPhoneAndPassword(String phoneNumber, String password);


    @Insert("insert into student_t(uid, password) " +
            "VALUES(#{uid}, #{password})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void addStudentByUid(Student student);

    @Insert("insert into student_t(uid, phone_Number, password) " +
            "VALUES(#{uid}, #{phoneNumber}, #{password})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void addStudentByPhone(Student student);

}
