package com.delta.EmailService.adapter;

public interface EmailSenderGateway {

    void sendEmail(String to, String subject, String body);
}
