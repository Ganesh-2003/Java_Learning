package com.learning.com.module1introduction.impl;

import com.learning.com.module1introduction.NotificationService;
import org.springframework.stereotype.Component;

@Component
public class SmsNotificationService implements NotificationService {

    @Override
    public void send(String message){
        System.out.println("SMS sending..." + message);
    }

}
