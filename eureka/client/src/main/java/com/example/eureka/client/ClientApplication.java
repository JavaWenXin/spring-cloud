package com.example.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ClientApplication {

    public static void main(String[] args) {
        //new SpringApplicationBuilder(ClientApplication.class).web(WebApplicationType.SERVLET).run(args);

        SpringApplication.run(ClientApplication.class, args);
    }

}
