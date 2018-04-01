package com.springcloud.mailService;

import com.netflix.discovery.converters.Auto;
import org.apache.velocity.app.VelocityEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.ui.velocity.VelocityEngineUtils;

import javax.mail.internet.MimeMessage;
import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName 丁杏凯
 * @Description TODO
 * @Author Administrator
 * @Date 2018/4/1 13:40
 * @Version 1.0
 * IDEA 2018.1
 **/
@Service
public class TemplateMessageService {

    @Autowired
    private JavaMailSender javaMailSender;

    @Autowired
    private VelocityEngine velocityEngine;
    
    /**
       *@Anthor 丁杏凯
       *Description 嵌入静态资源的短信接口
       *Date 15:46 2018/4/1 
       *Param 
       *@Return 
       *By IDEA 2018.1
     **/   
    public void sendTemplateMail() throws Exception{
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();

        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage,true);
        mimeMessageHelper.setFrom("979352276@qq.com");
        mimeMessageHelper.setTo("979352276@qq.com");
        mimeMessageHelper.setSubject("主题：嵌入静态资源");
        Map<String, Object> model = new HashMap<>();
        model.put("name","wuna");
        String text = VelocityEngineUtils.mergeTemplateIntoString(
                velocityEngine,"test.vm","UTF-8",model);
         mimeMessageHelper.setText(text,true);

        javaMailSender.send(mimeMessage);
    }
}
