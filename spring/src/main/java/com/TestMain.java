package com;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Author: wangzn
 * DateTime: 2018/11/2 14:16
 */
public class TestMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        PropertyPlaceholderConfigurer annotationPropertyConfigurer = (PropertyPlaceholderConfigurer) context.getBean("annotationPropertyConfigurer");
        System.out.println(annotationPropertyConfigurer.getClass());
    }
}
