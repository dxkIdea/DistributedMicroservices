package com.springcloud.web;

import com.springcloud.Service.FeginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 丁杏凯
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2018/3/2810:25
 * IDEA 2017.2
 */
@RestController
public class FeginController {
    @Autowired
    private FeginService feginService;

    @GetMapping("/test")
    public String feign(){
        return feginService.feginTest();
    }
}
