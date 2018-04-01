package com.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@Configuration
@SuppressWarnings("all")
public class LoadBalancedConfig {
    @Bean
    @LoadBalanced//启动负载均衡功能
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
