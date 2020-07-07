package com.packet.cardatabase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CardatabaseApplication {

	public static void main(String[] args) {
		// After adding this comment the application is restarted because of spring-boot-devtools in pom.xml.
		SpringApplication.run(CardatabaseApplication.class, args);
	}

}
