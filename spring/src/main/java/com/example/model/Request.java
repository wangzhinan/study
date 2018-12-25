package com.example.model;

/**
 * Author: wangzn
 * DateTime: 2018/11/23 8:45
 */
public class Request<T> {
    private T param;

    public Request() {
    }

    public Request(T param) {
        this.param = param;
    }

    public T getParam() {
        return param;
    }

    public void setParam(T param) {
        this.param = param;
    }
}
