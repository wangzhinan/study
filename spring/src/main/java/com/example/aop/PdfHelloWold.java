package com.example.aop;

/**
 * Author: wangzn
 * DateTime: 2018/10/31 13:30
 */
public class PdfHelloWold implements HelloWorld {
    @Override
    public int hello(String s) {
        System.out.println("PdfHelloWold.hello---" + s);
        return 1;
    }

    @Override
    public void print(String s) {
        System.out.println("PdfHelloWold.print---" + s);
    }
}
