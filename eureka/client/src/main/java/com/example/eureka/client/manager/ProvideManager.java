package com.example.eureka.client.manager;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("provide-1")
public interface ProvideManager {
    @RequestMapping(method = RequestMethod.GET, value = "/provide")
    String sayHello();
}
