package com.psi.springboot.service.impl;

import com.psi.springboot.pojo.Role;
import com.psi.springboot.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 根据负载均衡调用远程服务
 */
@Service
public class RoleLoadBalance implements RoleService {
    /**
     * 远程调用客户端
     */
    @Autowired
    private RestTemplate restTemplate;

    /**
     * 支持负载均衡的调用客户端
     */
    @Autowired
    private LoadBalancerClient loadBalancerClient;


    public String getServerUrl() {
        ServiceInstance roleProvider = loadBalancerClient.choose("ROLEPROVIDER");
        String host = roleProvider.getHost();
        int port = roleProvider.getPort();
        return "http://" + host + ":" + port;
    }

    @Override
    public Role getRole() {
        String url = getServerUrl();
        Role role = restTemplate.getForObject(url + "/getRole", Role.class);
        return role;
    }
}
