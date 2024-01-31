package com.example.Assignment1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Annotation indicating that this class is the main application class and should be considered for autoconfiguration by Spring Boot
@SpringBootApplication
public class Assignment1Application {

	// The main method is the entry point for the Java application
	public static void main(String[] args) {
		// Method to run the Spring Boot application, passing the class and command line arguments
		SpringApplication.run(Assignment1Application.class, args);
	}

}
