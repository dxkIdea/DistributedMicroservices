package com.springcloud.web;

import com.springcloud.entity.User;
import com.springcloud.rabbit.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 丁杏凯
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2018/3/2618:07
 * IDEA 2017.2
 */
@RestController
public class RabbitController {
    @Autowired
    private Sender sender;

    @GetMapping("/sendMQ")
    public String sendMQ(){
        sender.send();
        return "success";
    }
}
