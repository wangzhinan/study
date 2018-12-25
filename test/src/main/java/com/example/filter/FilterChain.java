package com.example.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: wangzn
 * DateTime: 2018/11/23 14:22
 */
public class FilterChain {
    private int index = 0;
    private List<Filter> filters = new ArrayList<Filter>();

    public void add(Filter filter){
        filters.add(filter);
    }

    public void doFilter(Request request,Response response){
        if (filters.isEmpty() || index >= filters.size()){
            return;
        }
        Filter filter = filters.get(index++);
        filter.doFilter(request,response,this);
    }
}
