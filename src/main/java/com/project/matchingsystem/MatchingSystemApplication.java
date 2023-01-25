package com.project.matchingsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MatchingSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(MatchingSystemApplication.class, args);
    }

}