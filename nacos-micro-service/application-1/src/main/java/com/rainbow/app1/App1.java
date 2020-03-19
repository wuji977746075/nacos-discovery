package com.rainbow.app1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class App1 {
    public static void main(String[] args) {
        SpringApplication.run(App1.class,args);
    }
}
