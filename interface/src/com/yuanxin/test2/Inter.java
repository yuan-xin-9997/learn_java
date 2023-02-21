package com.yuanxin.test2;

public interface Inter {
    // 成员变量：前面系统自动添加 public static final
    public static final int NUM = 10;

    // 成员方法：前面系统自动添加 public abstract，没有final，否则不能重写
    public abstract void show();
}
