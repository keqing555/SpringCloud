package com.psi.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient //开启Eureka
@EnableFeignClients //开启Feign,Fegin整合Ribbon及Eureka，支持负载均衡
//@EnableCircuitBreaker   //开启熔断器
//@EnableHystrix
@EnableHystrixDashboard //开启仪表盘
public class RoleConsumerApp03 {
    public static void main(String[] args) {
        SpringApplication.run(RoleConsumerApp03.class, args);
        System.out.println("RoleConsumer03启动");
    }
}
