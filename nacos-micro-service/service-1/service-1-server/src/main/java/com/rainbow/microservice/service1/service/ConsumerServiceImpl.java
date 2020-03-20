package com.rainbow.microservice.service1.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.rainbow.microservice.service1.api.ConsumerService;
import com.rainbow.microservice.service2.api.ProviderService;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;

@Service
public class ConsumerServiceImpl implements ConsumerService {
    @Reference
    ProviderService providerService;

    @SentinelResource("service1-ser")
    public String service() {
        return "service1-invoke : " +providerService.service();
    }
}
