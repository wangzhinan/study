package com.example.filter;

/**
 * Author: wangzn
 * DateTime: 2018/11/23 14:28
 */
public class LeftBracketFilter implements Filter {
    public void doFilter(Request request, Response response, FilterChain chain) {
        request.setBody("("+request.getBody());
        chain.doFilter(request,response);
        response.setBody("("+response.getBody());
    }
}
