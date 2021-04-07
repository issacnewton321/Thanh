package com.abc.Thanh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.abc.entity")
@ComponentScan("com.abc.controller")
@EnableJpaRepositories("com.abc.repository")
public class ThanhApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThanhApplication.class, args);
	}

}
