package com.example.hystrix_eureka_consumer_feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableHystrix
@EnableFeignClients
@SpringBootApplication
public class HystrixEurekaConsumerFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixEurekaConsumerFeignApplication.class, args);
    }

}
