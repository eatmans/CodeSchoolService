package com.blackwater.codeschool.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author eatmans
 * @version 1.0
 * @date 2021/4/5
 */

@RestController
@Api(tags = {"主页相关接口"}, value = "测试模块")
public class IndexController {

    @RequestMapping("/")
    public String index(){
        return "连接成功,请开始使用接口吧！ \n" +
                "接口文档1： http://kede.rjxh.cloud:8879/document.html  \n" +
                "接口文档2： http://kede.rjxh.cloud:8879/docs.html \n" +
                "接口文档3： http://kede.rjxh.cloud:8879/swagger-ui.html \n";
    }

}
