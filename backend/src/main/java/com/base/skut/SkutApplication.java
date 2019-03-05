package com.base.skut;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.HashMap;

@SpringBootApplication
@EnableJpaRepositories("com.base.skut.repository")
public class SkutApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(SkutApplication.class, args);
	}

}
