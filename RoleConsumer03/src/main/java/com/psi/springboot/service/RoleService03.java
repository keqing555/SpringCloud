package com.psi.springboot.service;

import com.psi.springboot.config.FeignConfig;
import com.psi.springboot.pojo.Role;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 指定要获取的服务名称
 * 指定Feign日志配置文件
 * 指定回滚方法
 */
@FeignClient(value = "ROLEPROVIDER", configuration = FeignConfig.class, fallback = RoleService03Impl.class)
public interface RoleService03 {
    /**
     * Feign客户端从指定服务中心里获取指定服务
     * 由映射名称指定
     *
     * @return
     */
    @GetMapping("/getRole")//指定要获取的服务名称
    public Role getRole03();

}
