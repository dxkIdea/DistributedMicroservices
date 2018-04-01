package com.springcloud.Service;

import com.netflix.discovery.converters.Auto;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author 丁杏凯
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2018/3/2516:51
 * IDEA 2017.2
 */
@Service
public class TestService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "ErroMethod")
    public String test(){
        return restTemplate.getForObject("http://CLIENT-TEST/test",String.class);
        //return restTemplate.postForObject("",new Object(),String.class);
    }

    public String ErroMethod(){
        return "由于调用服务出现故障，因此调用此回调函数···";
    }

}
