package com.blackwater.codeschool.service.impl;


import com.blackwater.codeschool.entity.Result;
import com.blackwater.codeschool.entity.ResultCode;
import com.blackwater.codeschool.entity.Student;
import com.blackwater.codeschool.mapper.StudentMapper;
import com.blackwater.codeschool.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author eatmans
 * @version 1.0
 * @date 2021/4/4
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentMapper studentMapper;

    @Override
    public Result<?> getStudentAll() {

        return Result.success(ResultCode.SUCCESS, studentMapper.getStudentAll());
    }

    @Override
    public Result<?> getStudentByClazzId(String clazzId) {

        return Result.success(ResultCode.SUCCESS, studentMapper.getStudentByClazzId(clazzId));
    }

    @Override
    public Result<?> getStudentByUid(Integer uid) {
        return Result.success(ResultCode.SUCCESS, studentMapper.getStudentByUid(uid));
    }

    @Override
    public Result<?> getStudentByPhoneNumber(String phoneNumber) {

        return Result.success(ResultCode.SUCCESS, studentMapper.getStudentByPhoneNumber(phoneNumber));
    }

    @Override
    public Result<?> getStudentByUidAndPassword(Integer uid, String password) {

        return Result.success(ResultCode.SUCCESS, studentMapper.getStudentByUidAndPassword(uid, password));

    }

    @Override
    public Result<?> loginByPhoneNumberAndPassword(String phoneNumber, String password) {
        if(studentMapper.getStudentByPhoneAndPassword(phoneNumber,password) != null){
            return Result.success(ResultCode.SUCCESS, studentMapper.getStudentByPhoneAndPassword(phoneNumber,password));
        }else{
            return Result.error(ResultCode.LOGIN_FAILED);
        }
    }

    @Override
    public Result<?> addStudentByUid(Student student) {
        studentMapper.addStudentByUid(student);
        return Result.success(ResultCode.SUCCESS);
    }

    @Override
    public Result<?> addStudentByPhone(Student student) {
        if (studentMapper.getStudentByPhoneNumber(student.getPhoneNumber()) == null) {
            studentMapper.addStudentByPhone(student);
            return Result.success(ResultCode.SUCCESS);
        } else {
            return Result.error(ResultCode.REPEAT_REGISTER);
        }

    }


}
