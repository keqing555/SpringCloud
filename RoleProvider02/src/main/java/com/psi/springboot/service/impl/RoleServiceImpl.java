package com.psi.springboot.service.impl;

import com.psi.springboot.pojo.Role;
import com.psi.springboot.pojo.Weapon;
import com.psi.springboot.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

@Service
public class RoleServiceImpl implements RoleService {

    @Override
    public Role getRole() {
        Role role = new Role();
        role.setId(1);
        role.setName("刻晴");
        // Weapon weapon = new Weapon(1, "匣里龙吟");
        Weapon weapon2 = new Weapon(2, "黑剑");
        List<Weapon> list = new ArrayList<>();
        //  list.add(weapon);
        list.add(weapon2);
        role.setWeaponList(list);
        try {
            //随机休眠0-3000ms
            Thread.sleep(new Random().nextInt(3000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return role;
    }
}
