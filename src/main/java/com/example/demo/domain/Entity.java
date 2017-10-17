package com.example.demo.domain;

/**
 * Created by liumin5 on 2017/10/16.
 */
public class Entity {

    private String name;
    private String password;

    public Entity(){}

    public Entity(String name, String password) {
        this.name = name;
        this.password = password;
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
