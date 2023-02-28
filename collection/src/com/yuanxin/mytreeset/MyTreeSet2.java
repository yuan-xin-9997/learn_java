package com.yuanxin.mytreeset;

import java.util.TreeSet;

/**
 * TreeSet集合来存储Student类型
 */
public class MyTreeSet2 {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>();

        Student s1 = new Student("zhangsan",28);
        Student s2 = new Student("lisi",27);
        Student s3 = new Student("wangwu",29);
        Student s4 = new Student("zhaoliu",28);
        Student s5 = new Student("qianqi",30);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        System.out.println(ts);// [Student{name='lisi', age=27}, Student{name='zhangsan', age=28}, Student{name='zhaoliu', age=28}, Student{name='wangwu', age=29}, Student{name='qianqi', age=30}]
    }
}
