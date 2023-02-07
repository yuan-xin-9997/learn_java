package com.oop_itheima_01;

public class PhoneDemo {
    public static void main(String[] args){
        // 格式：类名 对象名 = new 类名()
        Phone p = new Phone();

        // 使用成员变量
        System.out.println(p.brand);
        System.out.println(p.price);

        p.brand = "xiaomi";
        p.price = 2999;

        // 使用成员变量
        System.out.println(p.brand);
        System.out.println(p.price);

        // 使用成员方法
        p.call();
        p.sendMessage();

    }
}
