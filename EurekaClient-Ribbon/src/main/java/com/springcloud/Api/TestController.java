package com.springcloud.Api;

import com.springcloud.Service.TestService;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 丁杏凯
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2018/3/2516:58
 * IDEA 2017.2
 */
@RestController
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping("/test")
    public String test(){
        return testService.test();
    }
}
