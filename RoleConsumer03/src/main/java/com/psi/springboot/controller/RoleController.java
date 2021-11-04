package com.psi.springboot.controller;

import com.psi.springboot.pojo.Role;
import com.psi.springboot.service.RoleService03;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("role")
public class RoleController {
    //Feign接口
    @Autowired
    private RoleService03 roleService;

    @GetMapping("/getFeign")
    public Role getRole03() {
        return roleService.getRole03();
    }
}
