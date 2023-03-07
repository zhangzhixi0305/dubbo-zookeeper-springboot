package com.zhixi.pojo;

import java.io.Serializable;

/**
 * @ClassName Student
 * @Author zhangzhixi
 * @Description
 * @Date 2023-03-03 21:25
 * @Version 1.0
 */
public class User implements Serializable {

    private static final long serialVersionUID = 5326869065007028518L;
    private Integer id;
    private String name;
    private String password;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
