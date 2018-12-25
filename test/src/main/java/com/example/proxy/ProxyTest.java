package com.example.proxy;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * Author: wangzn
 * DateTime: 2018/11/22 14:08
 */
public class ProxyTest {
    public static void main(String[] args) {

    }

    @Test
    public void testProxy(){
        final IUserServiceImpl iUserService = new IUserServiceImpl();
        IUserService userService = (IUserService) Proxy.newProxyInstance(IUserService.class.getClassLoader()
                , new Class[]{IUserService.class}, new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println(method.getName()+"------"+"args = "+ Arrays.toString(args));
                        try {
                            return method.invoke(iUserService,args);
                        } finally {
                            System.out.println("end -----");
                        }
                    }
                });
        int result = userService.login("admin", "123456");
        System.out.println(result);

    }
}
