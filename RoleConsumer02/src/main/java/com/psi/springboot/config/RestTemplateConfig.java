package com.psi.springboot.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
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
        //设置Ribbon超时响应，或者在yml文件设置
        HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();
        factory.setConnectTimeout(250);
        factory.setReadTimeout(1000);
        //返回RestTemplate实例
        return new RestTemplate(factory);
    }
}
