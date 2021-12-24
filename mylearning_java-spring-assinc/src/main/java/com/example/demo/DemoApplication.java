package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("1 ...");
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("2 ...");
	}

}
