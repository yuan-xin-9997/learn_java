package com.oop_itheima_02;
/*
    学生测试类
 */

public class StudentDemo {
    public static void main(String[] args) {
        // 创建对象
        Student s = new Student();

        System.out.println(s.name + ", " + s.age);

        // 赋值
        s.name = "lin";
        s.age = 30;

        System.out.println(s.name + ", " + s.age);
        System.out.println(s);

        // 调用成员方法
        s.study();
        s.doHomework();



    }
}
