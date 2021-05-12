package com.example.Springwithmongodb;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringwithmongodbApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SpringwithmongodbApplication.class);
		app.setDefaultProperties(Collections
		          .singletonMap("server.port", "8182"));
		app.run(args);
		System.out.println("Hello world!!");
	}

}
