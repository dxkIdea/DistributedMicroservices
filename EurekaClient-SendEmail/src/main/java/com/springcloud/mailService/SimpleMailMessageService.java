package com.springcloud.mailService;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
 * 普通邮件发送
 */
@Service
public class SimpleMailMessageService {
    @Autowired
    private JavaMailSender javaMailSender;
    
    /**
       *@Anthor 丁杏凯
       *Description 
       *Date 13:22 2018/4/1
       *Param 
       *@Return 
       *By IDEA 2018.1
     **/   
    
    public void test()throws Exception{
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("979352276@qq.com");
        message.setTo("979352276@qq.com");
        message.setSentDate(new Date());
        message.setSubject("测试主题");
        message.setText("测试邮件发送");

        javaMailSender.send(message);
    }
}

