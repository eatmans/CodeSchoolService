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
 * @date 2021/3/29
 */
@Data
@ApiModel(description = "学生实体类")
public class Student implements Serializable {

    private static final long serialVersionUID = 7790720615290006508L;
    @ApiModelProperty(value = "自增长ID")
    @TableId(type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "学号")
    private Integer uid;

    @ApiModelProperty(value = "真实姓名")
    private String realName;

    @ApiModelProperty(value = "性别")
    private Byte sex;

    @ApiModelProperty(value = "UnionId")
    private String unionId;

    @ApiModelProperty(value = "OpenId")
    private String openId;

    @ApiModelProperty(value = "昵称")
    private String nickName;

    @ApiModelProperty(value = "头像地址")
    private String avatarUrl;

    @ApiModelProperty(value = "班级名")
    private String clazzId;

    @ApiModelProperty(value = "手机号码")
    private String phoneNumber;

    @ApiModelProperty(value = "密码")
    private String password;

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
