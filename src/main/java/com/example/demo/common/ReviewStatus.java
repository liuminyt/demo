package com.example.demo.common;

/**
 * Created by liumin5 on 2017/9/17.
 */
public enum ReviewStatus {

    NEW(0, "new"),
    ACCEPTED(10, "accepted"),
    REJECTED(-10, "rejected"),
    DELETED(-100, "deleted");

    private int value;
    private String desc;

    ReviewStatus(int value, String desc){
        this.value = value;
        this.desc = desc;
    }

    public static ReviewStatus get(int value){
        for (ReviewStatus r: ReviewStatus.values()) {
            if (r.getValue() == value){
                return r;
            }
        }
        return null;
    }

    public int getValue() {
        return value;
    }

    public String getDesc() {
        return desc;
    }
}
