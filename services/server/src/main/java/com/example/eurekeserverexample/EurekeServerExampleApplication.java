package com.example.eurekeserverexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekeServerExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekeServerExampleApplication.class, args);
    }

}
