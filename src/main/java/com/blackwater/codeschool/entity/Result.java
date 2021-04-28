package com.blackwater.codeschool.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Data
@ApiModel(description = "响应对象")
public class Result<T> implements Serializable {

    private static final long serialVersionUID = -3087228697208635683L;

    @ApiModelProperty(value = "返回码", example = "200")
    private Integer code;

    @ApiModelProperty(value = "返回码描述", example = "请求成功")
    private String desc;

    @ApiModelProperty(value = "响应时间戳", example = "2020-08-12 14:37:11")
    private Date timestamp = new Date();

    @ApiModelProperty(value = "返回结果")
    private Object data;

    public Result() {

    }

    private Result(T data) {
        this.code = 200;
        this.desc = "请求成功";
        this.data = data;
    }

    public Result(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    private Result(ResultCode resultCode) {
        if (resultCode != null) {
            this.code = resultCode.getCode();
            this.desc = resultCode.getDesc();
        }
    }

    private Result(ResultCode resultCode, T data) {
        if (resultCode != null) {
            this.code = resultCode.getCode();
            this.desc = resultCode.getDesc();
        }
        if (data != null) {
            this.data = data;
        }
    }

    public Result(ResultCode resultCode, String desc) {
        this(resultCode);
        this.desc = desc;
    }


    public Result(Collection collection) {
        this.code = ResultCode.SUCCESS.getCode();
        this.desc = ResultCode.SUCCESS.getDesc();
        this.data = collection;
    }

    public Result(ResultCode resultCode, Collection collection) {
        this(collection);
        this.code = resultCode.getCode();
        this.desc = resultCode.getDesc();
    }


    /**
     * 成功时候的调用
     */
    public static <T> Result<T> success(ResultCode resultCode) {
        return new Result<>(resultCode);
    }

    /**
     * 成功时候的调用
     */
    public static <T> Result<T> success(T data) {
        return new Result<>(data);
    }
    /**
     * 成功时候的调用
     */
    public static <T> Result<T> success(ResultCode resultCode, T data) {
        return new Result<>(resultCode, data);
    }


    /**
     * 失败时候的调用
     */
    public static <T> Result<T> error(ResultCode resultCode) {
        return new Result<>(resultCode);
    }

    /**
     * 失败时候的调用
     */
    public static <T> Result<T> error(Integer code, String desc) {
        return new Result<>(code, desc);
    }

    public static <T> Result<T> error(ResultCode resultCode, T data) {
        return new Result<>(resultCode, data);
    }
    
}
