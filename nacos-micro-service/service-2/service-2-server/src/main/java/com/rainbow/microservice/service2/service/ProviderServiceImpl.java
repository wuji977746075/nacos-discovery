package com.rainbow.microservice.service2.service;

import com.rainbow.microservice.service2.api.ProviderService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class ProviderServiceImpl implements ProviderService {
    public String service() {
        return "provider invoke";
    }
}
