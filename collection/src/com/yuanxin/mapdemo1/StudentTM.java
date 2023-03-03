package com.yuanxin.mapdemo1;

public class StudentTM /*implements Comparable<StudentTM>*/{
//public class StudentTM{
    private String name;
    private int age;

    public StudentTM() {
    }

    public StudentTM(String name, int age) {
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
        return "StudentTM{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // 自然排序
    /*
    @Override
    public int compareTo(StudentTM o) {
        // 按照年龄排序
        int result = -1 * (this.getAge() - o.getAge());
        // 次要条件：按照姓名排序
        result = result == 0 ? this.getName().compareTo(o.getName()):result;
        return result;
    }

     */
}
