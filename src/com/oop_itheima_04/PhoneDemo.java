package com.oop_itheima_04;

public class PhoneDemo {
    public static void main(String[] args) {
        // 无参构造方法+set方法
        Phone p1 = new Phone();
        p1.setBrand("xiaomi");
        p1.setPrice(2999);
        System.out.println(p1.getPrice()+p1.getBrand());
        // 带参构造方法
        Phone p2 = new Phone("huawei", 3999);

        System.out.println(p2.getPrice()+p2.getBrand());
    }
}
