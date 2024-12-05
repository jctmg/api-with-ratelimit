package com.tmg.apiwithratelimit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ApiWithRateLimitApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiWithRateLimitApplication.class, args);
	}

}
