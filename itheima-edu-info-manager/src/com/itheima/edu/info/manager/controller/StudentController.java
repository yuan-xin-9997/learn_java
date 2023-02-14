package com.itheima.edu.info.manager.controller;

import com.itheima.edu.info.manager.domain.Student;
import com.itheima.edu.info.manager.service.StudentService;

import java.awt.*;
import java.util.Scanner;

public class StudentController {
    // 开启学生管理系统，并展示学生管理系统菜单
    public void start() {
        Scanner sc = new Scanner(System.in);
        studentLoop: while (true){
            System.out.println("--------欢迎来到 <学生> 管理系统--------");
            System.out.println("请输入您的选择: 1.添加学生  2.删除学生  3.修改学生  4.查看学生  5.退出");
            String choice = sc.next();
            switch (choice){
                case "1":
                    // System.out.println("添加");
                    addStudent();
                    break;
                case "2":
                    System.out.println("删除");
                    break;
                case "3":
                    System.out.println("修改");
                    break;
                case "4":
                    System.out.println("查看");
                    break;
                case "5":
                    System.out.println("感谢您使用学生管理系统，再见！");
                    break studentLoop;
                default:
                    System.out.println("您的输入有误，请重新输入");
                    break;
            }
        }
    }

    public void addStudent() {
        StudentService studentService = new StudentService();
        // 1. 键盘接收学生信息
        Scanner sc = new Scanner(System.in);
        String id;
        while(true) {
            System.out.println("请输入学生id");
            id = sc.next();
            boolean flag = studentService.isExists(id);
            if(flag){
                System.out.println("学号"+id+"已被占用，请重新输入");
            }else{
                break;
            }
        }
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
        // 3. 将学生对象，传递给StudentService（业务员）类中的addStudent方法
        boolean result = studentService.addStudent(stu);
        // 4. 根据StudentService返回结果，打印提示
        if(result){
            System.out.println("添加成功");
        }else{
            System.out.println("添加失败");
        }
    }
}
