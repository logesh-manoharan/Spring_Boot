package com.example.secondproject;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecondprojectApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SecondprojectApplication.class);
        // running the web server in 8083 port
		app.setDefaultProperties(Collections
          .singletonMap("server.port", "8083"));
        app.run(args);
		System.out.println("Hello World!!");
	}

}
