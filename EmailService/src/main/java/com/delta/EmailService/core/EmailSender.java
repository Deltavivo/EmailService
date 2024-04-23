package com.delta.EmailService.core;

public interface EmailSender {
    void sendEmail(String to, String subject, String body);
}
