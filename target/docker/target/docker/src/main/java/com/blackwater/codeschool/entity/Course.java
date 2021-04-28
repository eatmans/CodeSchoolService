package com.blackwater.codeschool.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * @author eatmans
 * @version 1.0
 * @date 2021/4/1
 */

@Data
@ApiModel("课程实体类")
@Repository
public class Course implements Serializable {
    private static final long serialVersionUID = 571950520838946839L;
    @ApiModelProperty("自增长Id")
    private Integer id;
    @ApiModelProperty(value = "开课学院")
    private String college;
    @ApiModelProperty(value = "校区")
    private String campus;
    @ApiModelProperty(value = "课程编号")
    private Integer courseCode;
    @ApiModelProperty(value = "老师编号")
    private String teacherCode;
    @ApiModelProperty(value = "老师名称")
    private String teacherName;
    @ApiModelProperty(value = " 教学班组成")
    private String clazzId;
    @ApiModelProperty(value = "课程名称")
    private String courseName;
    @ApiModelProperty(value = "周次")
    private String times;
    @ApiModelProperty(value = "星期几")
    private String week;
    @ApiModelProperty(value = "节数")
    private String section;
    @ApiModelProperty(value = "上课地点")
    private String courseAddress;
    @ApiModelProperty(value = "班级所属学院")
    private String department;
    @ApiModelProperty(value = "课程性质")
    private String properties;
    @ApiModelProperty(value = "备注")
    private String remarks;

}
