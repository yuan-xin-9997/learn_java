package com.itheima.edu.info.manager.dao;

import com.itheima.edu.info.manager.domain.Student;

import java.util.ArrayList;

public class OtherStudentDao {
    // 1.创建学生对象数组
    // static的特点
    //         被static修饰的成员，会被该类的所有对象所[共享]，是我们判断是否使用静态关键字的条件，类似于单例
    //         被static修饰的成员，会随着类的加载而加载，优先于对象的存在，对象需要类加载后，才能创建
    //              非静态需要在创建对象之后，才可以进行使用
    //         多了一种调用方式，可以通过类名.成员 进行调用
    //         静态方法中，只能访问静态成员（成员变量、成员方法），非静态方法中，可以使用静态成员，也可以使用非静态成员
    //         静态方法中，没有this关键字。this需要在创建对象之后，才会存在，静态存在的时候，对象可能还没被创建

    // 集合容器
    private static ArrayList<Student> stus = new ArrayList<>();
    static {
        Student stu1 = new Student("heima001", "张三", "23", "1999-11-11");
        Student stu2 = new Student("heima002", "李四", "25", "2000-11-11");

        stus.add(stu1);
        stus.add(stu2);
    }

    public boolean addStudent(Student stu) {
        stus.add(stu);
        return true;
    }

    public Student[] findAllStudent() {
        Student[] students = new Student[stus.size()];
        for (int i = 0; i < students.length; i++) {
            students[i] = stus.get(i);
        }
        return students;
    }

    public void deleteStudentById(String id) {
        // 1. 查找id所在容器所在的索引位置
        int index = getIndex(id);
        // 2. 将该索引位置，使用null元素进行替代
        stus.remove(index);
    }

    public int getIndex(String id){
        int index = -1;
        for (int i = 0; i < stus.size(); i++) {
            Student stu = stus.get(i);
            if(stu != null && stu.getId().equals(id)){
                index = i;
                break;
            }
        }
        return index;
    }

    public void updateStudent(String id, Student stu) {
        // 1. 查找id在容器中的索引位置
        int index = getIndex(id);
        // 2. 将该索引位置，使用新的学生对象替换
        stus.set(index, stu);
    }
}

