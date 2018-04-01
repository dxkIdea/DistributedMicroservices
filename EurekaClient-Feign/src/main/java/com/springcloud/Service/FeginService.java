package com.springcloud.Service;

import com.springcloud.config.FeginServiceHystric;
import feign.Param;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 丁杏凯
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2018/3/2810:22
 * IDEA 2017.2
 */
@FeignClient(value = "Client-Test",fallback = FeginServiceHystric.class)
public interface FeginService {
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    String feginTest();
}
