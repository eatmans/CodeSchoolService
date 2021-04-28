package com.blackwater.codeschool.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author eatmans
 * @version 1.0
 * @date 2021/4/4
 */
@Data
@ApiModel(description = "事件实体类")
public class Event implements Serializable {

    private static final long serialVersionUID = -1330502011095522358L;
    @ApiModelProperty(value = "id")
    private Integer id;
    @ApiModelProperty(value = "学号")
    private Integer uid;

}
