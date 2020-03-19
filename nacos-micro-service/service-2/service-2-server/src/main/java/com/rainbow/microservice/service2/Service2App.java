package com.rainbow.microservice.service2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Service2App {
    public static void main(String[] args) {
        SpringApplication.run(Service2App.class,args);
    }
}
