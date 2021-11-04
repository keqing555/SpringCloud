package com.psi.springboot.service;

import com.psi.springboot.pojo.Role;
import org.springframework.stereotype.Service;

@Service
public class RoleService03Impl implements RoleService03 {
    /**
     * 触发熔断器的失败回滚方法
     * @return
     */
    @Override
    public Role getRole03() {
        return new Role(2, "熔断器触发，回滚", null);
    }
}
