package com.pro.prosperschool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.pro.prosperschool.repository")
@EntityScan("com.pro.prosperschool.model")
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
public class prosperschoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(prosperschoolApplication.class, args);
	}

}
