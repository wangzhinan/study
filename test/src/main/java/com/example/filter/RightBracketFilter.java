package com.example.filter;

/**
 * Author: wangzn
 * DateTime: 2018/11/23 14:32
 */
public class RightBracketFilter implements Filter {
    public void doFilter(Request request, Response response, FilterChain chain) {
        request.setBody(request.getBody()+")");
        chain.doFilter(request,response);
        response.setBody(response.getBody()+")");
    }
}
