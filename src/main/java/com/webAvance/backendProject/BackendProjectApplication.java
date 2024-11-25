package com.webAvance.backendProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class BackendProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendProjectApplication.class, args);
	}

	// Define a RestTemplate bean to be used for RestTemplate injection
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
