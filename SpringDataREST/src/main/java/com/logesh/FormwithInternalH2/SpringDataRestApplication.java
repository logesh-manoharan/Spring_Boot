package com.logesh.FormwithInternalH2;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class SpringDataRestApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SpringDataRestApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", "8181"));
		app.run(args);
	}

}
