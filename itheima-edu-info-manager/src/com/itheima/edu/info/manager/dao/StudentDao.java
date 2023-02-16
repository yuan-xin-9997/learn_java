package com.itheima.edu.info.manager.dao;

import com.itheima.edu.info.manager.domain.Student;

public class StudentDao {
    // 1.创建学生对象数组
    // static的特点
    //         被static修饰的成员，会被该类的所有对象所[共享]，是我们判断是否使用静态关键字的条件，类似于单例
    //         被static修饰的成员，会随着类的加载而加载，优先于对象的存在，对象需要类加载后，才能创建
    //              非静态需要在创建对象之后，才可以进行使用
    //         多了一种调用方式，可以通过类名.成员 进行调用
    //         静态方法中，只能访问静态成员（成员变量、成员方法），非静态方法中，可以使用静态成员，也可以使用非静态成员
    //         静态方法中，没有this关键字。this需要在创建对象之后，才会存在，静态存在的时候，对象可能还没被创建

    private static Student[] stus = new Student[5];

    public boolean addStudent(Student stu) {
        // 2. 添加学生到数组
        // 2.1 定义变量index为-1，假设数组已经全部存满，没有null的元素
        int index = -1;
        // 2.2 遍历数组取出每一个元素，判断是否是null
        for (int i = 0; i < stus.length; i++) {
            Student student = stus[i];
            if(student == null){
                // 2.3 如果为null，让index记录当前索引位置，并使用break结束循环遍历
                index = i;
                break;
            }
        }
        // 3. 返回是否添加成功的boolean类型状态
        if(index == -1){
            // 装满了
            return false;
        }else{
            // 没有装满，正常添加，返回true
            stus[index] = stu;
            return true;
        }
    }

    public Student[] findAllStudent() {
        return stus;
    }

    public void deleteStudentById(String id) {
        // 1. 查找id所在容器所在的索引位置
        int index = getIndex(id);
        // 2. 将该索引位置，使用null元素进行替代
        stus[index] = null;
    }

    public int getIndex(String id){
        int index = -1;
        for (int i = 0; i < stus.length; i++) {
            Student stu = stus[i];
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
        stus[index] = stu;
    }
}
