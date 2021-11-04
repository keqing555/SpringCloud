package com.psi.springboot.service;

import com.psi.springboot.config.FeignConfig;
import com.psi.springboot.pojo.Role;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 指定要获取的服务名称
 * 指定Feign日志配置文件
 */
@FeignClient(value = "ROLEPROVIDER", configuration = FeignConfig.class)
public interface RoleService {

    @GetMapping("/getRole")
    public Role getRole();
}
