package com.learning.com.module1introduction.impl;

import com.learning.com.module1introduction.NotificationService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class EmailNotificationService implements NotificationService {

    @Override
    public void send(String message) {
        System.out.println("Sending Email" +  message);
    }
}
