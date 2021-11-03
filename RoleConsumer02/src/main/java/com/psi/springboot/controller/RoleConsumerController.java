package com.psi.springboot.controller;

import com.psi.springboot.pojo.Role;
import com.psi.springboot.service.impl.RoleRibbon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleConsumerController {
    /**
     * 根据负载均衡获取不定服务器服务
     */
    @Autowired
    private RoleRibbon roleRibbon;

    @RequestMapping("/roleRibbon")
    public Role roleBalance() {
        return roleRibbon.getRole();
    }

}
