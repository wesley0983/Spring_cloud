package com.example.hystrix_eureka_consumer_feign.feign;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class HelloRemoteHystrix implements HelloRemote{

    @Override
    public String hello(@RequestParam(value = "name")String name) {
        return "Hello World";
    }
}
