package com.logesh.FormwithInternalH2;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FormwithInternalH2Application {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(FormwithInternalH2Application.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", "8181"));
		app.run(args);
		System.out.println("Hello World");
	}

}
