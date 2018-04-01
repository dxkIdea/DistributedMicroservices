package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName 丁杏凯
 * @Description TODO
 * @Author Administrator
 * @Date 2018/4/1 22:44
 * @Version 1.0
 * IDEA 2018.1
 **/
@SpringBootApplication
//@EnableEurekaClient
public class ConsulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsulApplication.class,args);
    }

}
