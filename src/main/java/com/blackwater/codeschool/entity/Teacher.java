package com.blackwater.codeschool.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

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

    @ApiModelProperty(value = "教师职称")
    private String title;

    @ApiModelProperty(value = "简介")
    private String intro;

    @ApiModelProperty(value = "入职时间")
    private Date joinTime;

    @ApiModelProperty(value = "是否已经删除  0未删除 1已经删除")
    @TableLogic
    private Integer deleted;

    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private Date createTime = new Date();

    @ApiModelProperty(value = "更新时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;
}
