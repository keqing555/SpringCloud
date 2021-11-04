package com.psi.springboot.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {
    /**
     * 获取RestTemplate对象
     *
     * @return
     */
    @Bean
    @LoadBalanced   //开启Ribbon（客户端负载均衡器）
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
