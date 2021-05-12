package com.example.FormwithMongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.util.Collections;

@SpringBootApplication
public class FormwithMongodbApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(FormwithMongodbApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", "8181"));
		app.run(args);
		System.out.println("Hello world");
	}

}
