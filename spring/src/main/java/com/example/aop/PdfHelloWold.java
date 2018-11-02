package com.example.aop;

/**
 * Author: wangzn
 * DateTime: 2018/10/31 13:30
 */
public class PdfHelloWold implements HelloWorld {
    @Override
    public void hello(String s) {
        System.out.println("PdfHelloWold.hello---"+s);
    }

    @Override
    public void print(String s) {
        System.out.println("PdfHelloWold.print---"+s);
    }
}
