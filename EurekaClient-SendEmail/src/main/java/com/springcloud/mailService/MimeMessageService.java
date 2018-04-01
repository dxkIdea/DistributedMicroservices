package com.springcloud.mailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.internet.MimeMessage;
import java.io.File;
import java.util.Date;

/**
 * @ClassName 丁杏凯
 * @Description 带附件邮件
 * @Author Administrator
 * @Date 2018/4/1 13:22
 * @Version 1.0
 * IDEA 2018.1
 **/
@Service
public class MimeMessageService {
    @Autowired
    private JavaMailSender javaMailSender;

    /**
       *@Anthor 丁杏凯
       *Description 邮件携带附件
       *Date 13:24 2018/4/1
       *Param
       *@Return
       *By IDEA 2018.1
     **/
    public void sendAttachmentsMail() throws Exception {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();

        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage,true);
        mimeMessageHelper.setFrom("979352276@qq.com");
        mimeMessageHelper.setTo("979352276@qq.com");
        mimeMessageHelper.setText("附件邮件测试");
        mimeMessageHelper.setSubject("带有附件的邮件，测试内容----");
        mimeMessageHelper.setSentDate(new Date());
        File file = new File("C:\\Users\\Administrator\\Desktop","wuna.jpg");
        FileSystemResource fileSystemResource = new FileSystemResource(file);
        //mimeMessageHelper.addAttachment("附件-1",fileSystemResource);
        // mimeMessageHelper.addAttachment("附件-2",fileSystemResource);
        mimeMessageHelper.addInline("wuna",fileSystemResource);

        javaMailSender.send(mimeMessage);
    }
    /**
       *@Anthor 丁杏凯
       *Description 嵌入静态资源
       *Date 13:38 2018/4/1
       *Param
       *@Return
       *By IDEA 2018.1
     **/
    public void sendInlineMail() throws Exception {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();

        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage,true);
        mimeMessageHelper.setFrom("979352276@qq.com");
        mimeMessageHelper.setTo("979352276@qq.com");
        mimeMessageHelper.setSubject("主题：嵌入静态资源");
        mimeMessageHelper.setText("<html><body><img src=\"cid:wuna\" ></body></html>" ,true);
        mimeMessageHelper.setSentDate(new Date());
        File file = new File("C:\\Users\\Administrator\\Desktop","wuna.jpg");
        FileSystemResource fileSystemResource = new FileSystemResource(file);
        mimeMessageHelper.addInline("wuna",fileSystemResource);

        javaMailSender.send(mimeMessage);
    }

}
