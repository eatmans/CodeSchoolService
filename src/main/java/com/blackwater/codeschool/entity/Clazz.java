package com.blackwater.codeschool.entity;


import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author eatmans
 * @version 1.0
 * @date 2021/4/3
 */
@Data
@ApiModel(description = "班级实体类")
public class Clazz implements Serializable {

    private static final long serialVersionUID = 8346985330510980204L;

    @ApiModelProperty(value = "自增长ID")
    @TableId(type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "班级ID")
    private Integer clazzId;

    @ApiModelProperty(value = "班级名称")
    private String clazzName;

    @ApiModelProperty(value = "班级人数")
    private Integer clazzNumber;

    @ApiModelProperty(value = "教师编号")
    private String teacherCode;

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
