package com.slashCode.springboot;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.slashCode.springboot"})
public class EmployManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployManagementApplication.class, args);
		
		System.out.println("heelo spring ");
	}
//NEW LINE
}
