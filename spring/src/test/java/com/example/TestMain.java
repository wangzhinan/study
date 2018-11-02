package com.example;

import com.example.aop.HelloWorld;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author: wangzn
 * DateTime: 2018/11/2 15:09
 */
public class TestMain {
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    public static void main(String[] args) {

    }

    @Test
    public void testAOP(){
        HelloWorld htmlHelloWorld = (HelloWorld) context.getBean("htmlHelloWorld");
        htmlHelloWorld.hello("amdin");
        htmlHelloWorld.print("123456");

        System.out.println("-------------------------");

        HelloWorld pdfHelloWorld = (HelloWorld) context.getBean("pdfHelloWorld");
        pdfHelloWorld.hello("root");
        pdfHelloWorld.print("password");
    }
}
