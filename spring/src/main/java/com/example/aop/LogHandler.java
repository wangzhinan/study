package com.example.aop;

/**
 * Author: wangzn
 * DateTime: 2018/10/31 13:52
 */
public class LogHandler {

    public void logBefore() {
        System.out.println("Log before method");
    }

    public void logAfter() {
        System.out.println("Log after method");
    }
}
