package com.rainbow.microservice.service2.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.rainbow.microservice.service2.api.ProviderService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class ProviderServiceImpl implements ProviderService {
    @SentinelResource("service2-ser")
    public String service() {
        return "provider invoke";
    }
}
