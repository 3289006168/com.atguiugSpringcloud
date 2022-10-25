package com.atguigu.springcloud.config;

import com.netflix.loadbalancer.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyRandomRule{
    @Bean
    public IRule myRule() {
        // RandomRule 为随机策略
        return  new RandomRule();
    }
}