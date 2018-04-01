package com.springcloud.config;

import com.springcloud.Service.FeginService;
import org.springframework.stereotype.Component;

/**
 * @author 丁杏凯
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2018/3/2813:42
 * IDEA 2017.2
 */
@Component
public class FeginServiceHystric implements FeginService{
    @Override
    public String feginTest() {
        return  "由于Fegin调用服务失败，因此调用回调函数···";
    }
}
