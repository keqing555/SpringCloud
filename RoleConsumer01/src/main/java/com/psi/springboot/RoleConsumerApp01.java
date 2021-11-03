package com.psi.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RoleConsumerApp01 {
    public static void main(String[] args) {
        SpringApplication.run(RoleConsumerApp01.class, args);
        System.out.println("RoleConsumer01启动");
    }
}
