package com.edu.edu_planner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class EduPlannerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EduPlannerApplication.class, args);
    }

}
