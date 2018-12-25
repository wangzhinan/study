package com.example.filter;

/**
 * Author: wangzn
 * DateTime: 2018/11/23 14:17
 */
public class Response {
    private String body = "";

    public Response(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

}
