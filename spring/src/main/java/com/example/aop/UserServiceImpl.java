package com.example.aop;

/**
 * Author: wangzn
 * DateTime: 2018/11/22 15:40
 */
public class UserServiceImpl implements UserService {
    @Override
    public int login(String user, String password) {
        System.out.println("login : user = "+user +" password = "+password);
        return -1;
    }
}
