package com.example.demo.common;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by liumin5 on 2017/9/17.
 */
public enum Status {

    AGREE(10, "accepted"), REFUSE(-10, "refused"), PENDING(0, "pending"), DELETE(-100, "deleted");
    private static final Map<Integer, Status> LOOKUP = new HashMap<>();

    static {
        for (Status status: Status.values()) {
            LOOKUP.put(status.getValue(), status);
        }

    }

    private int value;
    private String desc;

    Status(int value, String desc){
        this.value = value;
        this.desc = desc;
    }

    public static Status get(int value){
        return LOOKUP.get(value);
    }

    public int getValue() {
        return value;
    }

    public String getDesc() {
        return desc;
    }
}
