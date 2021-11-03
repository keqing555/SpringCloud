package com.psi.springboot.service.impl;

import com.psi.springboot.pojo.Role;
import com.psi.springboot.pojo.Weapon;
import com.psi.springboot.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class RoleServiceImpl implements RoleService {
    /**
     * 根据服务名称查询服务信息
     */
    @Autowired
    private DiscoveryClient discoveryClient;

    //调用rest风格接口工具类
    @Autowired
    private RestTemplate restTemplate;

    /**
     * 从Eureka获取对应服务的端口和地址
     *
     * @return
     */
    public String getServerInfo() {
        List<ServiceInstance> roleProvider01 = discoveryClient.getInstances("ROLEPROVIDER01");
        //该服务集群只有一个服务，获取第一个
        if (roleProvider01 != null && roleProvider01.size() > 0) {
            ServiceInstance serviceInstance = roleProvider01.get(0);
            //获取该服务的主机地址
            String host = serviceInstance.getHost();
            //获取该服务的端口
            int port = serviceInstance.getPort();
            return "http://" + host + ":" + port;
        }
        return null;
    }

    @Override
    public Role getRole() {
//        //返回响应体对象包含的信息
//        ResponseEntity<Role> forEntity = restTemplate.getForEntity(getRole() + "/getRole", Role.class);
//        //转为对象
//        Role roel = forEntity.getBody();
        //返回对象
        Role role = restTemplate.getForObject(getServerInfo() + "/getRole", Role.class);
        return role;
    }

    @Override
    public Map<String, Object> getAll() {
        return null;
    }
}
