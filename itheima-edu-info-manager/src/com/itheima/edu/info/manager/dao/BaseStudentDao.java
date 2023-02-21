package com.itheima.edu.info.manager.dao;

import com.itheima.edu.info.manager.domain.Student;

//public abstract class BaseStudentDao {
public interface BaseStudentDao {
    // 当一个类中的所有方法都是抽象方法的时候，我们就可以将其定义为接口
    //接口也是一种引用数据类型，它比抽象类还要抽象

    public abstract boolean addStudent(Student stu) ;

    public abstract Student[] findAllStudent();

    public abstract void deleteStudentById(String id) ;

    public abstract int getIndex(String id);

    public abstract void updateStudent(String id, Student stu) ;
}
