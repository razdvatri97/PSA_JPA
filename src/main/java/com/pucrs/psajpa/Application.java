package com.pucrs.psajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("base_package")
@EnableJpaRepositories(basePackages = "repository")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
