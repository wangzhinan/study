package com.example.service;

import com.example.model.Request;
import com.example.model.Response;
import com.example.model.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

/**
 * Author: wangzn
 * DateTime: 2018/11/23 8:41
 */
public class UserService {

    @ResponseBody
    @RequestMapping("/getUser")
    public User getUser(){
        return new User("admin","123456");
    }


    @PostMapping
    @GetMapping
    @RequestMapping("/login")
    public Response login(String param){
        Response response = new Response();
        response.setMessage("success");
        response.setCode(0);
        return response;
    }
}
