package com.example.eureka.provide.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Properties;

@Controller
@Slf4j
public class ProvideController {

    @ResponseBody
    @RequestMapping("/provide")
    private String provideService(){
        return System.getProperty("port");
    }
}
