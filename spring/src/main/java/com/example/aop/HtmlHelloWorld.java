package com.example.aop;

/**
 * Author: wangzn
 * DateTime: 2018/10/31 13:29
 */
public class HtmlHelloWorld implements HelloWorld {
    @Override
    public void hello(String s) {
        System.out.println("HtmlHelloWorld.hello---"+s);
    }

    @Override
    public void print(String s) {
        System.out.println("HtmlHelloWorld.print----"+s);
    }
}
