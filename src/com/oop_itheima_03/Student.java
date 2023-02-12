package com.oop_itheima_03;
/*
标准 JavaBean 须满足如下要求：
l 成员变量使用 private 修饰
l 提供每一个成员变量对应的 setXxx() / getXxx()
l 提供一个无参构造方法
 */

import java.rmi.StubNotFoundException;

public class Student {
    private String name;
    private int age;

    public Student(){}

    public void setName(String name) {
        this.name = name;
//        name = a;
    }

    public String getName() {
        return this.name;
//        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
