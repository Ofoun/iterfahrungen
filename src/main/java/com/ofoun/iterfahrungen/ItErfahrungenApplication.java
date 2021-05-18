package com.ofoun.iterfahrungen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class ItErfahrungenApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItErfahrungenApplication.class, args);
	}

}
