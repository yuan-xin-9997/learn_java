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
}
