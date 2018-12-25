package com.example.consumer;

/**
 * Author: wangzn
 * DateTime: 2018/12/24 14:58
 */
public interface AbstractStorage {
    void consume(int num);
    void produce(int num);
}
