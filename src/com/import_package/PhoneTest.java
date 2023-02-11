package com.import_package;

//import com.oop_itheima_04.Phone;

import com.oop_itheima_03.Student;
import com.oop_itheima_04.Phone;

public class PhoneTest {
    public static void main(String[] args) {
        Phone p = new Phone();  // IDEA 将鼠标光标放到Phone后面，按Alt+Enter可快速导包
        p.setBrand("Apple");
        System.out.println(p.getBrand());

        Student s = new Student();
        s.setAge(10);
        System.out.println(s.getAge());
    }
}
