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
 * @date 2021/4/4
 */
@Data
@ApiModel(description = "事件实体类")
public class Event implements Serializable {

    private static final long serialVersionUID = -1330502011095522358L;

    @ApiModelProperty(value = "自增长ID")
    @TableId(type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "学号")
    private Integer uid;

    @ApiModelProperty(value = "课程ID")
    private Integer cid;

    @ApiModelProperty(value = "内容")
    private String content;

    @ApiModelProperty(value = "是否已经删除 0未删除 1已经删除")
    @TableLogic
    private Integer deleted;

    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private Date createTime = new Date();

    @ApiModelProperty(value = "更新时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

}
