package com.yuanxin.test3;

public interface InterA {
    public default void show(){
        System.out.println("我是A接口中的show方法");
    }
}
