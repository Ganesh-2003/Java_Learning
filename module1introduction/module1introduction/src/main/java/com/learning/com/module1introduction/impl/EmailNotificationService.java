package com.learning.com.module1introduction.impl;

import com.learning.com.module1introduction.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Qualifier("emailNotif")
//@ConditionalOnProperty(
//        prefix = "feature.notification",
//        name = "type",
//        havingValue = "email"
//)
public class EmailNotificationService implements NotificationService {

    @Override
    public void send(String message) {
        System.out.println("Sending Email " +  message);
    }
}
