package com.gs.jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.gs.jwt.api.repo")
public class main {

	public static void main(String[] args) {
		SpringApplication.run(main.class, args);
	}

}
