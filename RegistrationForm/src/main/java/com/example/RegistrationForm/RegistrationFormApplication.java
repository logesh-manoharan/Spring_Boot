package com.example.RegistrationForm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;
@SpringBootApplication
public class RegistrationFormApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(RegistrationFormApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", "8181"));
		app.run(args);
		System.out.println("Hello world!!");
	}

}
