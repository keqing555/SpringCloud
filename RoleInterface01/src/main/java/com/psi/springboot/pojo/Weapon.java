package com.psi.springboot.pojo;

import java.io.Serializable;

public class Weapon implements Serializable {
    private Integer wid;
    private String wname;

    public Weapon() {
    }

    public Weapon(Integer wid, String wname) {
        this.wid = wid;
        this.wname = wname;
    }

    public Integer getWid() {
        return wid;
    }

    public void setWid(Integer wid) {
        this.wid = wid;
    }

    public String getWname() {
        return wname;
    }

    public void setWname(String wname) {
        this.wname = wname;
    }

    @Override
    public String toString() {
        return "\n Weapon{" +
                "wid=" + wid +
                ", wname='" + wname + '\'' +
                '}'+"\n";
    }
}
