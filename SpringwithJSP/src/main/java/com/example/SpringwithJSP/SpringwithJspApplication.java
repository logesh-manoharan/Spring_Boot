package com.example.SpringwithJSP;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class SpringwithJspApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SpringwithJspApplication.class);
		app.setDefaultProperties(Collections
		          .singletonMap("server.port", "8181"));
		app.run(args);
		System.out.println("Hello world!!");
	}

}
