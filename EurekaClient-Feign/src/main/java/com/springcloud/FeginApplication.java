package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author 丁杏凯
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2018/3/2810:21
 * IDEA 2017.2
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class FeginApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeginApplication.class,args);
    }
}
