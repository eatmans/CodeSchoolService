package com.blackwater.codeschool.service;

import com.blackwater.codeschool.entity.Result;
import com.blackwater.codeschool.entity.Student;


/**
 * @author eatmans
 * @version 1.0
 * @date 2021/3/31
 */
public interface StudentService {

    Result<?> getStudentAll();

    // 根据班级id获取该班的全部学生
    Result<?> getStudentByClazzId(String clazzId);

    // 根据学号获取学生信息
    Result<?> getStudentByUid(Integer uid);

    // 根据手机号码获取学生信息
    Result<?> getStudentByPhoneNumber(String phoneNumber);

    // 根据学号和密码获取学生信息
    Result<?> getStudentByUidAndPassword(Integer uid, String password);

    // 根据手机和密码获取学生信息
    Result<?> loginByPhoneNumberAndPassword(String phoneNumber, String password);

    // 通过学号添加学生
    Result<?> addStudentByUid(Student student);

    // 通过手机号码添加学生
    Result<?> addStudentByPhone(Student student);

}
