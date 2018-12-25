package com.example.proxy;

/**
 * Author: wangzn
 * DateTime: 2018/11/22 14:14
 */
public class IUserServiceImpl implements IUserService {
    public int login(String user, String password) {
        System.out.println("method invoke user = "+user+" password = "+password);
        return 0;
    }
}
