package com.lan.utils;

public class CommonResult {
    // 响应业务状态
    private Integer code;

    // 响应消息
    private String msg;

    // 响应中的数据
    private Object data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public CommonResult() {

    }

    public CommonResult(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public CommonResult(Object data) {
        this.code = 200;
        this.msg = "OK";
        this.data = data;
    }

    public static CommonResult build(Integer code, String msg, Object data) {
        return new CommonResult(code, msg, data);
    }

    public static CommonResult build(Integer code, String msg) {
        return new CommonResult(code, msg, null);
    }
    public static CommonResult ok(Object data) {
        return new CommonResult(data);
    }

    public static CommonResult ok() {
        return new CommonResult(null);
    }
}
