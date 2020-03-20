package com.rainbow.microservice.controller;

import com.rainbow.microservice.client.ProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
//    public static final Logger LOG = LoggerFactory.getLogger(ConsumerController.class);
    @Autowired
    ProviderClient providerClient;

    @GetMapping("/service")
    public String service(){
        String rs = providerClient.service();
//        LOG.info("provider invoke");
        return "consumer invoke" + "|" + rs;
    }
}
