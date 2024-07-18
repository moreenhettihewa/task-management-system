package com.tasks.managemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class ManagemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManagemoApplication.class, args);
    }
}
