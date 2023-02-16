package com.itheima.edu.info.manager.service;

import com.itheima.edu.info.manager.dao.StudentDao;
import com.itheima.edu.info.manager.domain.Student;

public class StudentService {
    // 1. 创建StudentDao（库管）
    private StudentDao studentDao = new StudentDao();
    public boolean addStudent(Student stu) {
        // 2. 将学生对象，传递给StudentDao库管中的addStudent方法
        // 3. 将返回的boolean类型结果，返还给StudentController
        return studentDao.addStudent(stu);
    }

    public boolean isExists(String id) {
//        StudentDao studentDao = new StudentDao();
        Student[] stus = studentDao.findAllStudent();
        boolean exists = false;
        // 遍历数组，获取每一个人学生对象，准备进行判断
        for (int i = 0; i < stus.length; i++) {
            Student student = stus[i];
            if(student != null && student.getId().equals(id)) {
                exists = true;
                break;
            }
        }
        return exists;
    }

    public Student[] findAllStudent() {
        // 1. 调用库存管理对象的findAllStudent获取学生对象数组
        Student[] stus = studentDao.findAllStudent();
        // 2. 判断数组中是否有学生信息（有：返回地址，无：返回null）
        // 数组只要存在一个不是null的元素，就代表有学生信息
        boolean flag = false;
        for (int i = 0; i < stus.length; i++) {
            Student stu = stus[i];
            if(stu != null){
                flag = true;
                break;
            }
        }
        if(flag){
            return stus;
        }else{
            return null;
        }
    }

    public void deleteStudentById(String id) {
        studentDao.deleteStudentById(id);
    }

    public void updateStudent(String id, Student stu) {
        studentDao.updateStudent(id, stu);
    }
}
