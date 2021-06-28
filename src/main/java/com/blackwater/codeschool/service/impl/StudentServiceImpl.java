package com.blackwater.codeschool.service.impl;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.blackwater.codeschool.entity.Result;
import com.blackwater.codeschool.entity.ResultCode;
import com.blackwater.codeschool.entity.Student;
import com.blackwater.codeschool.mapper.StudentMapper;
import com.blackwater.codeschool.service.StudentService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @author eatmans
 * @version 1.0
 * @date 2021/4/4
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    @Resource
    private RedisTemplate redisTemplate;

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

        String key = "user_" + phoneNumber;
        ValueOperations<String, Student> operations = redisTemplate.opsForValue();

        //判断redis中是否有键为key的缓存
        boolean hasKey = redisTemplate.hasKey(key);

        Student student;
        if (hasKey) {
            student = operations.get(key);
            return Result.success(ResultCode.SUCCESS, student);
        } else {
            QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("phone_number", phoneNumber);
            student = studentMapper.selectOne(queryWrapper);
            if (student == null) {
                return Result.error(ResultCode.MISSING_RECORD);
            } else {
                // 写入缓存
                operations.set(key, student, 5, TimeUnit.HOURS);
                return Result.success(ResultCode.SUCCESS, student);
            }
        }
    }

    @Override
    public Result<?> getStudentByUidAndPassword(Integer uid, String password) {

        return Result.success(ResultCode.SUCCESS, studentMapper.getStudentByUidAndPassword(uid, password));

    }

    @Override
    public Result<?> loginByPhoneNumberAndPassword(String phoneNumber, String password) {


        // 判断手机号码的情况
        if (StrUtil.isNullOrUndefined(phoneNumber) || phoneNumber.trim().isEmpty() || phoneNumber.length() != 11) {
            return Result.error(1000, "手机长度有误");
        }

        // 如果密码为空则直接返回
        if (StrUtil.isNullOrUndefined(password) || password.trim().isEmpty()) {
            return Result.error(1001, "密码为空");
        }

        Student student = studentMapper.getStudentByPhoneAndPassword(phoneNumber, password);

        String key = "user_" + phoneNumber;
        ValueOperations<String, Student> operations = redisTemplate.opsForValue();

        if (student != null) {
            operations.set(key, student, 5, TimeUnit.HOURS);
            return Result.success(ResultCode.SUCCESS, studentMapper.getStudentByPhoneAndPassword(phoneNumber, password));
        } else {
            return Result.error(ResultCode.MISSING_RECORD);
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
            String key = "user_" + student.getPhoneNumber();
            ValueOperations<String, Student> operations = redisTemplate.opsForValue();
            operations.set(key + "abc", student, 5, TimeUnit.HOURS);
            studentMapper.addStudentByPhone(student);
            return Result.success(ResultCode.SUCCESS);
        } else {
            return Result.error(ResultCode.REPEAT_REGISTER);
        }

    }


}
