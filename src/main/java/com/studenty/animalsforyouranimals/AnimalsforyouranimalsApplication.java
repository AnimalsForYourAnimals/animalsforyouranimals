package com.studenty.animalsforyouranimals;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
public class AnimalsforyouranimalsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnimalsforyouranimalsApplication.class, args);
	}
}
