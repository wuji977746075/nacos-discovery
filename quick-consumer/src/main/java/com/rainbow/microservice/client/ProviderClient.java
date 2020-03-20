package com.rainbow.microservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("quick-provider")
public interface ProviderClient {
    @GetMapping("/service")
    String service();
}
