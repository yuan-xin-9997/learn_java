package com.yuanxin.threaddemo5;

public class Demo {
    public static void main(String[] args) {
        // 获取调用currentThread方法的对象
        String name = Thread.currentThread().getName();
        System.out.println(name);
    }
}
