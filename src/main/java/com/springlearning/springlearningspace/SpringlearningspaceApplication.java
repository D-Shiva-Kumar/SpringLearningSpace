package com.springlearning.springlearningspace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SpringlearningspaceApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringlearningspaceApplication.class, args);

		System.out.println("System Started");
	}

}
