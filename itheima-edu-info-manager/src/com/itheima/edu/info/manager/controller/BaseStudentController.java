package com.itheima.edu.info.manager.controller;

import com.itheima.edu.info.manager.domain.Student;
import com.itheima.edu.info.manager.service.StudentService;

import java.util.Scanner;

public abstract class BaseStudentController {
    private final StudentService studentService = new StudentService();
    private final Scanner sc = new Scanner(System.in);

    // 开启学生管理系统，并展示学生管理系统菜单
    public final void start() {
//        Scanner sc = new Scanner(System.in);
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
//                    System.out.println("删除");
                    deleteStudentById();
                    break;
                case "3":
//                    System.out.println("修改");
                    updateStudent();
                    break;
                case "4":
//                    System.out.println("查看");
                    findAllStudent();
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

    public final void updateStudent() {
        String Id = inputStudentId();
        Student stu = inputStudentInfo(Id);
        // 3. 调用业务员中的deleteStudentById，根据ID更新学生
        studentService.updateStudent(Id, stu);
        // 4. 提示更新成功
        System.out.println("更新成功");
    }

    public final void deleteStudentById() {
        String Id = inputStudentId();
        // 3. 调用业务员中的deleteStudentById，根据ID删除学生
        studentService.deleteStudentById(Id);
        // 4. 提示删除成功
        System.out.println("删除成功");
    }

    public final void findAllStudent() {
//        StudentService studentService = new StudentService();
        // 1. 调用业务员中的获取方法，得到学生的对象数组
        Student[] stus = studentService.findAllStudent();

        // 2. 判断数组的内存地址，是否为null
        if(stus == null){
            System.out.println("查无信息，请添加后重试！");
            return;
        }
        // 3. 遍历数组，获取学生信息并打印在控制台
        System.out.println("学号\t\t姓名\t年龄\t生日");
        for (int i = 0; i < stus.length; i++) {
            Student stu = stus[i];
            if(stu != null){
                System.out.println(stu.getId()+"\t"+stu.getName()+"\t"+stu.getAge()+"\t\t"+stu.getBirthday());
            }
        }
    }

    public final void addStudent() {
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
        Student stu = inputStudentInfo(id);
        // 3. 将学生对象，传递给StudentService（业务员）类中的addStudent方法
        boolean result = studentService.addStudent(stu);
        // 4. 根据StudentService返回结果，打印提示
        if(result){
            System.out.println("添加成功");
        }else{
            System.out.println("添加失败");
        }
    }

    public final String inputStudentId(){
        String id;
        while(true){
            //1. 键盘录入要删除的学生id
            System.out.println("请输入学生id：");
            id = sc.next();
            // 2.判断id在容器中是否存在，如果不存在，则需要一直录入
            boolean flag = studentService.isExists(id);
            if(flag){
                break;
            }else{
                System.out.println("您输入的学生ID不存在，请重新输入：");
            }
        }
        return id;
    }

    public abstract Student inputStudentInfo(String id);

}
