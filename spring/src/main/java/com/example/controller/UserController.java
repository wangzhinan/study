package com.example.controller;

import com.example.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Author: wangzn
 * DateTime: 2018/11/3 16:09
 */

@Controller
public class UserController {

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@ModelAttribute("SpringWeb")User user,
                             ModelMap model) {
        model.addAttribute("name", user.getName());
        model.addAttribute("password", user.getPassword());
        model.addAttribute("errorInfo","");
        if (user.getName().equals("admin") && user.getPassword().equals("123456")){
            return "home";
        }
        model.addAttribute("errorInfo","你输入的帐号或密码不正确，请重新输入。");
        return "login";
    }
}
