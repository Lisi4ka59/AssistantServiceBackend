package com.lisi4ka.assistantservicebackend.emailComponent.controllers;

import com.lisi4ka.assistantservicebackend.emailComponent.utils.EmailData;
import com.lisi4ka.assistantservicebackend.emailComponent.services.EmailService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailSenderController {
    private final EmailService emailService;

    public EmailSenderController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping("/send-email")
    public void sendEmail(@RequestBody EmailData emailData) {
        emailService.sendEmail(emailData.getEmail(), emailData.getName(), emailData.getMessage());
    }
}
