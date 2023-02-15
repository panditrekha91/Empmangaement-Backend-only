package com.Aspire.Empmanagement;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EmpmanagementApplication {

	private static final String CommandLinerunner = null;

	public static void main(String[] args) {
		SpringApplication.run(EmpmanagementApplication.class, args);
		System.out.println("i am here...");
		
		// here add validations,@Notblank, max,min,email
		//exception handling
		
		
					
		
	}

}
