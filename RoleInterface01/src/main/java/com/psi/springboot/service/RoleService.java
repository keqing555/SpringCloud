package com.psi.springboot.service;

import com.psi.springboot.pojo.Role;

import java.util.Map;

public interface RoleService {
    public Role getRole();
    public Map<String,Object> getAll();
}
