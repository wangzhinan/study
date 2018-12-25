package com.example.filter;

/**
 * Author: wangzn
 * DateTime: 2018/11/23 14:18
 */
public class Request {
    private String body = "";

    public Request(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
