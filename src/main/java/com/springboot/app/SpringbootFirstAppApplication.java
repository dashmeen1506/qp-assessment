package com.springboot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootFirstAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootFirstAppApplication.class, args);
		
		System.out.println("Welcome to Spring Boot App...");
		
	}

}
