package com.example.demohello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoHelloApplication {

	public static void main(String[] args) {
		System.out.println("Start...");
		SpringApplication.run(DemoHelloApplication.class, args);
	}

}
