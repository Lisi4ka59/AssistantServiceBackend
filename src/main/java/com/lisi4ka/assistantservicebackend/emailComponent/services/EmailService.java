package com.lisi4ka.assistantservicebackend.emailComponent.services;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    @Autowired
    private JavaMailSender emailSender;

    public void sendEmail(String to, String subject, String text) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("assistantpro.service@mail.ru");
        message.setTo(to);
        message.setSubject(subject);
        message.setText(text);
        emailSender.send(message);
//        try {
//            MimeMessage message = emailSender.createMimeMessage();
//            MimeMessageHelper helper = new MimeMessageHelper(message, true);
//            helper.setTo(to);
//            helper.setSubject(subject);
//            helper.setText(text, true);
//            emailSender.send(message);
//            System.out.println("alive");
//        } catch (MessagingException ex) {
//            ex.printStackTrace();
//        }
    }
}
