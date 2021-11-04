package com.psi.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker   //开启熔断器
public class RoleConsumerApp02 {
    public static void main(String[] args) {
        SpringApplication.run(RoleConsumerApp02.class, args);
        System.out.println("RoleConsumer02启动");
    }
}
