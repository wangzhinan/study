package com.example;

import com.example.aop.HelloWorld;
import com.example.aop.UserService;
import com.example.model.Request;
import com.example.model.Response;
import com.example.model.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Author: wangzn
 * DateTime: 2018/11/2 15:09
 */
public class TestMain {
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        User user = new User("admin","123456");
        Response<User> response = new Response<>();
        response.setCode(0);
        response.setMessage("success");
        response.setData(user);
        try {
            String s = objectMapper.writeValueAsString(response);
            System.out.println(s);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        Request<User> request = new Request<>();
        request.setParam(user);
        try {
            String s = objectMapper.writeValueAsString(request);
            System.out.println(s);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        try {
            String userString = objectMapper.writeValueAsString(user);
            System.out.println("userString = " + userString);
            Response<String> response1 = new Response<>();
            response1.setData(userString);
            response1.setMessage("fail");
            response1.setCode(1);
            String responseString = objectMapper.writeValueAsString(response1);
            System.out.println("responseString = " + responseString);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        String re = "{\"param\":{\"name\":\"admin\",\"password\":\"123456\"}}";
        JavaType javaType = objectMapper.getTypeFactory().constructParametricType(Request.class,User.class);
        try {
            Request<User> userRequest = objectMapper.readValue(re,javaType);
            System.out.println(userRequest.getParam().getPassword());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }



    @Test
    public void testAOP(){
        HelloWorld htmlHelloWorld = (HelloWorld) context.getBean("htmlHelloWorld");
        htmlHelloWorld.hello("amdin");
        htmlHelloWorld.print("123456");

        System.out.println("-------------------------");
        UserService userService = (UserService) context.getBean("userService");
        userService.login("admin","123456");

//        HelloWorld pdfHelloWorld = (HelloWorld) context.getBean("pdfHelloWorld");
//        pdfHelloWorld.hello("root");
//        pdfHelloWorld.print("password");
    }
}
