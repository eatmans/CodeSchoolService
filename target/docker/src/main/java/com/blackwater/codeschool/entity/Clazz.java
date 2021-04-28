package com.blackwater.codeschool.entity;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

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
    private Integer id;
    @ApiModelProperty(value = "班级ID")
    private Integer clazzId;
    @ApiModelProperty(value = "班级名称")
    private String clazzName;

}
