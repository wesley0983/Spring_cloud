package com.example.eureka_server_three;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerThreeApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerThreeApplication.class, args);
    }

}
