package com.ESexample.ESdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan; // добавлено
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("com.ESexample.ESdemo.model")
@SpringBootApplication
public class
ESdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ESdemoApplication.class, args);
	}

}
