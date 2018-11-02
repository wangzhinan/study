package com.example.controller;

import com.example.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: wangzn
 * DateTime: 2018/10/31 17:30
 */
@Controller
public class HelloWorld {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String printHello(ModelMap model) {
        model.addAttribute("message", "Hello Spring MVC Framework!");
        List<String> list = new ArrayList<>();
        List<User> users = new ArrayList<>();
        for(int i = 0;i < 7;i++){
            list.add("hello"+i);
            users.add(new User("admin"+i,"password"+i));
        }
        ApplicationContext context = null;
        model.addAttribute("users",users);
        model.addAttribute("list",list);
        System.out.println("HelloWorld.printHello-----");
        return "hello";
    }
}
