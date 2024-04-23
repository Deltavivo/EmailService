package com.delta.EmailService.core.dto;

public record EmailRequest(String to, String subject, String body) {
}
