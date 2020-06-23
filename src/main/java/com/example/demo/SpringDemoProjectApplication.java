package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDemoProjectApplication {

	public static void main(String[] args) {
		System.out.println("Inside Main");
		SpringApplication.run(SpringDemoProjectApplication.class, args);
	}

}
