package com.yuanxin.mytreeset;

public class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        //按照对象的年龄进行排序
        //主要判断条件
        int result = this.age - o.age;
        //次要判断条件
        result = result == 0 ? this.name.compareTo(o.getName()) : result;// 三元运算符 Java
        return result;
    }
}
