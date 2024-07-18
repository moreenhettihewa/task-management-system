package com.tasks.managemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableJpaRepositories
public class ManagemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManagemoApplication.class, args);
    }
}
