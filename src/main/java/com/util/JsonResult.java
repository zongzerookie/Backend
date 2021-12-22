package com.util;

import sun.applet.resources.MsgAppletViewer;

import java.io.Serializable;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: ygc
 * \* Date: 2021/12/22
 * \* Time: 11:51
 * \* Description:
 * \
 */
public class JsonResult<T> implements Serializable {
    private int code = 200;
    private String msg;
    private T data;

    public static <T> JsonResult<T> get(int code, String msg, T data) {
        return new JsonResult<T>(code, msg, data);
    }

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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public JsonResult(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public JsonResult() {
    }
}
