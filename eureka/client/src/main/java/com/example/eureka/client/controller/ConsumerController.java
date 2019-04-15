package com.example.eureka.client.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.example.eureka.client.manager.ProvideManager;
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
    @Autowired
    ProvideManager provideManager;

    @RequestMapping("consumer")
    public String consumerService(){
        return restTemplate.getForEntity("http://provide-1/provide", String.class).getBody();
    }

    /**
     * 声明式服务测试
     * @return
     */
    @RequestMapping("feignTest")
    public String feignTest(){
        return provideManager.sayHello();
    }

    /**
     * 服务降级测试
     * @return
     */
    @RequestMapping("consumer-degrade")
    @SentinelResource(value = "consumer-degrade",fallback="degradeFallback")
    public String degrade(){
        return provideManager.sayHello();
    }

    public String degradeFallback(){
        return "进行降级处理";
    }
}
