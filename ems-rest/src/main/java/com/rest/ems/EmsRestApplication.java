package com.rest.ems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class EmsRestApplication {

	public static void main(String[] args) {
	ApplicationContext context =	SpringApplication.run(EmsRestApplication.class, args);
	}
	
	@Bean
	public RestTemplate getRestTemplate() {
		
		
		return new RestTemplate();
		
	}

}
