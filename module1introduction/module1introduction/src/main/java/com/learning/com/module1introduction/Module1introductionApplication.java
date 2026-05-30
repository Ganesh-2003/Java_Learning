package com.learning.com.module1introduction;

import ch.qos.logback.core.subst.NodeToStringTransformer;
import com.learning.com.module1introduction.impl.EmailNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Module1introductionApplication implements CommandLineRunner {

	@Autowired
	PaymentService paymentServiceObj;

	@Autowired
	NotificationService notificationServiceObj; //dependency injection

	public static void main(String[] args) {
		SpringApplication.run(Module1introductionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		paymentServiceObj.Pay();

		//NotificationService notificationServiceObj = new EmailNotificationService();
		notificationServiceObj.send("hello Ganesh");
	}

}
