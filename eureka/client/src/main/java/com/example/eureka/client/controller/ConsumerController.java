package com.example.eureka.client.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class ConsumerController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("consumer")
    public String consumerService(){
        return restTemplate.getForEntity("http://provide-1/provide", String.class).getBody();
    }
}
