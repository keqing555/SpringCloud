package com.psi.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer     //开启Eureka服务
public class EurekaApplication02 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication02.class, args);
        System.out.println("Eureka_02注册中心启动");
    }
}