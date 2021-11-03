package com.psi.springboot.controller;

import com.psi.springboot.pojo.Role;
import com.psi.springboot.service.RoleService;
import com.psi.springboot.service.impl.RoleLoadBalance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleConsumerController {
    /**
     * 获取指定服务器服务
     *
     * @return
     */
    @Autowired
    @Qualifier("roleServiceImpl2")
    private RoleService roleService;
    /**
     * 根据负载均衡获取不定服务器服务
     */
    @Autowired
    private RoleLoadBalance roleLoadBalance;

    @RequestMapping("/roleConsumer")
    public Role roleConsumer() {
        return roleService.getRole();
    }

    @RequestMapping("roleBalance")
    public Role roleBalance() {
        return roleLoadBalance.getRole();
    }

}
