package com.example.hystrix_eureka_consumer_feign.controller;

import com.example.hystrix_eureka_consumer_feign.feign.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class HelloController {

    @Autowired
    HelloRemote helloRemote;

    @GetMapping("")
    public String index(@RequestParam("name") String name) {
        return helloRemote.hello(name + "!");
    }

}
