package com;

import com.example.model.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.List;
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
        List<String> list = new ArrayList<>();

    }

    @Test
    public void test(){
        try {
            URL url = new URL("http://192.168.2.142:8080/user/login");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setDoOutput(true);
            OutputStream outputStream = connection.getOutputStream();
            String s = "param=test";
            outputStream.write(s.getBytes());
            InputStream inputStream = connection.getInputStream();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int length;
            byte[] buffer = new byte[1024];
            while ((length = inputStream.read(buffer)) != -1){
                byteArrayOutputStream.write(buffer,0,length);
            }
            String result = new String(byteArrayOutputStream.toByteArray());
            byteArrayOutputStream.close();
            outputStream.close();
            inputStream.close();
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public <T> void login(String param,Class<T> clazz){
        ObjectMapper objectMapper = new ObjectMapper();
    }
}
