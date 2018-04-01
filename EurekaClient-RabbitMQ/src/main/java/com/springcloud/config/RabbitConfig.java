package com.springcloud.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 丁杏凯
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2018/3/268:50
 * IDEA 2017.2
 */
@Configuration
public class RabbitConfig {
    @Bean
    public Queue queue(){
        return new Queue("hello");
    }
}
