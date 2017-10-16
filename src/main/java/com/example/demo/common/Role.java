package com.example.demo.common;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by liumin5 on 2017/9/17.
 */
public enum Role {
    MASTER(100, "master"), DEVELOPER(60, "developer"), MEMBER(10, "member");

    private static final Map<Integer, Role> LOOKUP = new HashMap<>();

    static {
        for (Role role : Role.values()){
            LOOKUP.put(role.getValue(), role);
        }
    }

    private int value;
    private String desc;

    Role(int value, String desc){
        this.value = value;
        this.desc = desc;
    }

    public static Role get(int value){
        return LOOKUP.get(value);
    }

    public int getValue() {
        return value;
    }

    public String getDesc() {
        return desc;
    }
}
