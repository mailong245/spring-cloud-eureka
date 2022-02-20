package com.example.eurekaclientexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaclientexampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaclientexampleApplication.class, args);
    }

}
