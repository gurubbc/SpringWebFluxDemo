package com.ofss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringWebFluxDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebFluxDemoApplication.class, args);
		System.out.println("CRUD using Spring WebFlux started....");
	}
}