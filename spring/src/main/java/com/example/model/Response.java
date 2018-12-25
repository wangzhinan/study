package com.example.model;

/**
 * Author: wangzn
 * DateTime: 2018/11/23 8:44
 */
public class Response<T> {
    private String message = "";
    private int code = 0;
    private T data;

    public Response() {
    }
    public Response(String message, int code) {
        this.message = message;
        this.code = code;
    }

    public Response(String message, int code, T data) {
        this.message = message;
        this.code = code;
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
