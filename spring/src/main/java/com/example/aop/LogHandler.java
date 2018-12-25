package com.example.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import java.util.Arrays;

/**
 * Author: wangzn
 * DateTime: 2018/10/31 13:52
 */
public class LogHandler {

    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Log before method params = " + Arrays.toString(joinPoint.getArgs()));
    }

    public void logAfter() {
        System.out.println("Log after method ");
    }

    public void logAfterReturn(Object result){
        System.out.println("result = " + result);
    }

    public void logAfterThrowing(Throwable throwable){
        System.out.println("throwable = " + throwable);
    }
}
