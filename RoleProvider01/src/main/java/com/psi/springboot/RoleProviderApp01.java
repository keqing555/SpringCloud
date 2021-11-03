package com.psi.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//作为服务提供方注册发现
@EnableDiscoveryClient  //其他注册中心推荐使用该注解
@EnableEurekaClient     //Eureka注册中心推荐使用
public class RoleProviderApp01 {
    public static void main(String[] args) {
        SpringApplication.run(RoleProviderApp01.class, args);
        System.out.println("RoleProvider01启动");
    }
}
