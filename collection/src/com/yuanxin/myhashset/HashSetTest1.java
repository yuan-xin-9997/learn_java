package com.yuanxin.myhashset;

import java.util.HashSet;

/*
需求：创建一个存储学生对象的集合，存储多个学生对象，使用程序实现在控制台遍历该集合
          要求：学生对象的成员变量值相同，我们就认为是同一个对象

 结论：
 如果HashSet集合要存储自定义对象，那么必须重写hashCode和equals方法
 */
public class HashSetTest1 {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<>();
        Student s1 = new Student("xiaozhi", 23);
        Student s2 = new Student("xiaomei", 26);
        Student s3 = new Student("xiaozhi", 23);
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
//        System.out.println("1"=="1");
        System.out.println(s1.equals(s3));
        for (Student h : hs) {
            System.out.println(h);
        }

        Integer i1 = 1;
        Integer i2 = 2;
        System.out.println(i1.equals(i2));
    }
}
