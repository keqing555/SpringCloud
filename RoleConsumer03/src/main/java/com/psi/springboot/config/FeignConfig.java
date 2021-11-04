package com.psi.springboot.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {
    /**
     * 获取FULL级别日志
     * @return
     */
    @Bean
    public Logger.Level getFeignLog() {
        return Logger.Level.FULL;
    }
}
