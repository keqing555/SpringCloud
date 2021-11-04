package com.psi.springboot.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.psi.springboot.pojo.Role;
import com.psi.springboot.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * RestTemplate+LoadBalanceClient
 * 根据负载均衡调用远程服务
 */
@Service
public class RoleRibbon implements RoleService {
    /**
     * 远程调用客户端，集成Ribbon（客户端负载均衡器）
     */
    @Autowired
    private RestTemplate restTemplate;

    public String getServerUrl() {
        return "http://ROLEPROVIDER";
    }

    @Override
    //访问超时（默认1s），执行回滚方法
    @HystrixCommand(fallbackMethod = "getRoleRollback")
    public Role getRole() {
        String url = getServerUrl();
        Role role = restTemplate.getForObject(url + "/getRole", Role.class);
        return role;
    }

    /**
     * 熔断器触发调用方法
     * 返回值类型必须和断路方法保持一致
     *
     * @return
     */
    public Role getRoleRollback() {
        return new Role(1, "熔断触发，方法回滚", null);
    }
}
