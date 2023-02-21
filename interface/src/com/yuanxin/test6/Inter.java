package com.yuanxin.test6;

public interface Inter {
    public default void show(){
        System.out.println("Inter....show");
    }
}
