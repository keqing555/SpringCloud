package com.psi.springboot.controller;

import com.psi.springboot.pojo.Role;
import com.psi.springboot.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleConsumerController {
    @Autowired
    private RoleService roleService;

    @RequestMapping("/roleConsumer")
    public Role roleConsumer() {
        return roleService.getRole();
    }

}
