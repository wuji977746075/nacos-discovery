package com.rainbow.app1.controller;

import com.rainbow.microservice.service1.api.ConsumerService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @Reference
    ConsumerService consumerService;

    @GetMapping("/service")
    public String service(){
        return "app1 invoke : " +consumerService.service();
    }

}
