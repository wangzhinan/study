package com.example.model;

/**
 * Author: wangzn
 * DateTime: 2018/11/22 17:14
 */
public class Person {
    private User user = new User("admin");

    static {
        User user1 = new User("root");
    }


}
