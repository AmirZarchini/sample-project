package com.example.samplespring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.samplespring.repositories"})
public class SampleSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleSpringApplication.class, args);
    }

}
