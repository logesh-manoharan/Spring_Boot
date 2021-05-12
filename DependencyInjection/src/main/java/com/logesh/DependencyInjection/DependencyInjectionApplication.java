package com.logesh.DependencyInjection;

import java.util.Collections;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(DependencyInjectionApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", "8181"));
		ConfigurableApplicationContext context = app.run(args);
		System.out.println("Hello world");
		
		// 'context' is used to access the SPRING CONTAINER. Inside the spring container
		// object/bean is created automatically when application starts running. We can get that
		// bean by using getBean() method provided by the 'ConfigurableApplicationContext.class'
		Alien alien1 = context.getBean(Alien.class); 
		alien1.hello();
	}

}
