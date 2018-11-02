package com.example.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Author: wangzn
 * DateTime: 2018/10/31 11:02
 */
public class HijackBeforeMethod implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("HijackBeforeMethod : Before method hijacked!");
    }
}
