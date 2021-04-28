package com.blackwater.codeschool.entity;

/**
 * @author eatmans
 * @version 1.0
 * @date 2021/4/22
 */
public enum ResultCode {

    UNKNOWN_ERROR(-100, "未知错误"),
    NEED_LOGIN(-1, "未登录"),
    REPEAT_REGISTER(-2, "该用户已注册"),
    USER_NOT_EXIST(-3, "不存在该用户"),
    PASSWORD_ERROR(-4, "密码错误"),
    EMPTY_USERNAME(-5, "用户名为空"),
    EMPTY_PASSWORD(-6, "密码为空"),
    SUCCESS(200, "请求成功"),
    FAILED(201, "请求失败"),
    REQUEST_ILLEGAL(202, "请求不合法"),
    BINDING_NOT(203, "该用户未绑定可得校園，请先绑定"),
    TOKEN_EXPIRED(400, "token已过期"),
    TOKEN_ERROR(401, "token错误"),
    VISITOR_FORBIDDEN(403, "游客无权限操作"),
    LOGIN_FAILED(10002, "登陆失败"),
    BINDING_FAILED(20002, "绑定失败"),
    REPEAT_BINDING(20003, "重复绑定"),
    UNIQUE_INDEX(20004, "重复数据"),
    REPORT_FAILED(30002, "举报失败"),
    RECOMMEND_FAILED(30002, "反馈失败"),
    POST_FAILED(40002, "发送失败"),
    MISSING_PARAMETER(40003, "参数异常"),
    DATA_EXCEPTION(40003, "数据异常"),
    MISSING_RECORD(40004, "记录不存在"),
    OFF_LINE(40004, "对方不在线,已转为留言"),
    SYSTEM_ERROR(50001, "系统异常"),
    UPDATE_FAILED(60002, "更新失败"),
    REQUEST_FREQUENT(50003, "请求过于频繁"),
    DELETE_FAILED(60004, "删除失败");



    private Integer code;

    private String desc;

    private ResultCode(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public void setCode(Integer code) {
        this.code = code;
    }


    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
