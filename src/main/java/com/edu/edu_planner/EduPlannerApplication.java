package com.edu.edu_planner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.edu.edu_planner.controller", "com.edu.edu_planner.service"})
public class EduPlannerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EduPlannerApplication.class, args);
	}

}
