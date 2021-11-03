package com.psi.springboot.pojo;

import java.io.Serializable;
import java.util.List;

public class Role implements Serializable {
    private Integer id;
    private String name;
    private List<Weapon> weaponList;

    public Role() {
    }

    public Role(Integer id, String name, List<Weapon> weaponList) {
        this.id = id;
        this.name = name;
        this.weaponList = weaponList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Weapon> getWeaponList() {
        return weaponList;
    }

    public void setWeaponList(List<Weapon> weaponList) {
        this.weaponList = weaponList;
    }

    @Override
    public String toString() {
        return "\n Role{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weaponList=" + weaponList +
                '}' + "\n";
    }
}
