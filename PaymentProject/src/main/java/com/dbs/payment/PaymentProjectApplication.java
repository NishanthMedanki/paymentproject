package com.dbs.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin
@EnableAspectJAutoProxy
public class PaymentProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentProjectApplication.class, args);
	}

}
