package com.itheima.edu.info.manager.controller;

import com.itheima.edu.info.manager.domain.Student;

import java.util.Scanner;

public class OtherStudentController extends BaseStudentController{
//    private StudentService studentService = new StudentService();
    private Scanner sc = new Scanner(System.in);

    // 开启学生管理系统，并展示学生管理系统菜单
    @Override
    public Student inputStudentInfo(String id){
        System.out.println("请输入学生姓名");
        String name = sc.next();
        System.out.println("请输入学生年龄");
        String age = sc.next();
        System.out.println("请输入学生生日");
        String birthday = sc.next();
        // 2.将学生信息封装为学生对象
        Student stu = new Student();
        stu.setId(id);
        stu.setName(name);
        stu.setAge(age);
        stu.setBirthday(birthday);
        return stu;
    }
}
