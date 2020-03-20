package com.rainbow.microservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {
    public static final Logger LOG = LoggerFactory.getLogger(ProviderController.class);

    @GetMapping("/service")
    public String service(){
        LOG.info("provider invoke");
        return "provider invoke";
    }
}
