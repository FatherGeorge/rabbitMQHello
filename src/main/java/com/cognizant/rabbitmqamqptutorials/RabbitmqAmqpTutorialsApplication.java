package com.cognizant.rabbitmqamqptutorials;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class RabbitmqAmqpTutorialsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitmqAmqpTutorialsApplication.class, args);
	}

}

