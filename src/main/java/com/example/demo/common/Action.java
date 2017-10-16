package com.example.demo.common;

/**
 * Created by liumin5 on 2017/9/17.
 */
public enum Action {

    ADD(10, "add"), DELETE(10, "delete"), UPDATE(30, "update");
    private int value;
    private String desc;

    Action(int value, String desc){
        this.value = value;
        this.desc = desc;
    }

    public static Action get(int value){
        for (Action action : Action.values()) {
            if (action.getValue() == value)
                return action;
        }
        return null;
    }

    public int getValue(){
        return value;
    }

    public String getDesc(){
        return desc;
    }
}
