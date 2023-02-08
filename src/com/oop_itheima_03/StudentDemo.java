package com.oop_itheima_03;

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("lin");
        s.setAge(30);
//        s.age = -30;
        System.out.println(s.getName()+","+s.getAge());
    }

}
