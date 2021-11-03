package com.psi.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RoleProviderApp02 {
    public static void main(String[] args) {
        SpringApplication.run(RoleProviderApp02.class, args);
        System.out.println("RoleProvider02启动");
    }
}
