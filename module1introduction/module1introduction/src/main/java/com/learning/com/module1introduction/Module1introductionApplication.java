package com.learning.com.module1introduction;

import ch.qos.logback.core.subst.NodeToStringTransformer;
import com.learning.com.module1introduction.impl.EmailNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class Module1introductionApplication implements CommandLineRunner {

	@Autowired
	PaymentService paymentServiceObj;

	//Normal Dependency Injection
	//@Autowired
//	final NotificationService notificationServiceObj; //dependency injection
//
//	public Module1introductionApplication(@Qualifier("smsNotif") NotificationService notificationServiceObj) {
//		this.notificationServiceObj = notificationServiceObj; // Constructor DI // Preferred Method - as we can use final which makes it immutable
//	}

	@Autowired
	Map<String, NotificationService> notificationServiceMap = new HashMap<>();

	public static void main(String[] args) {
		SpringApplication.run(Module1introductionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		paymentServiceObj.Pay();

		//NotificationService notificationServiceObj = new EmailNotificationService();
		//notificationServiceObj.send("hello Ganesh");

		for (var notificationService : notificationServiceMap.entrySet()) {
			System.out.println(notificationService.getKey());
			notificationService.getValue().send("Hello Ganesh");
		}
	}
}
