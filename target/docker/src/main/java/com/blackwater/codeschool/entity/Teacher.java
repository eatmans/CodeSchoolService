package com.blackwater.codeschool.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author eatmans
 * @version 1.0
 * @date 2021/4/2
 */
@Data
@ApiModel(description = "教师实体类")
public class Teacher implements Serializable {

    private static final long serialVersionUID = 2288521042660199395L;
    @ApiModelProperty(value = "自增长ID")
    private Integer id;
    @ApiModelProperty(value = "教师编号")
    private String teacherCode;
    @ApiModelProperty(value = "教师姓名")
    private String teacherName;
}
