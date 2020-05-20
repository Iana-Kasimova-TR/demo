package com.example.simplyCook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CookApplication {

	public static void main(String[] args) {
		SpringApplication.run(CookApplication.class, args);
	}

}
