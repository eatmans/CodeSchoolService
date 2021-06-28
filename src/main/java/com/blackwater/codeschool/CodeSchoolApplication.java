package com.blackwater.codeschool;

import org.mybatis.spring.annotation.MapperScan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author eatmans
 * @version 1.0
 * @date 2021/2/10
 */

@SpringBootApplication
@MapperScan("com.blackwater.codeschool.mapper")
public class CodeSchoolApplication {
    public static void main(String[] args) {
        SpringApplication.run(CodeSchoolApplication.class, args);
    }
}
