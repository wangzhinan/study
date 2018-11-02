package com.example.aop;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * Author: wangzn
 * DateTime: 2018/10/31 11:06
 */
public class HijackAfterMethod implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("HijackAfterMethod : After method hijacked!");
    }
}
