package com.yuanxin.mycollectiondemo1;

import java.util.ArrayList;
import java.util.Iterator;

public class MyCollectonDemo8 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student s1 = new Student("小皮同学",23);
        Student s2 = new Student("小路同学",31);
        Student s3 = new Student("小贾同学",33);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        System.out.println(list);//打印集合的元素，不是集合的地址

        // 三种遍历方式

        //迭代器的方式进行遍历
        Iterator<Student> it = list.iterator();
        while(it.hasNext()){
            Student s = it.next();
            System.out.println(s);
        }

        System.out.println("-------------------------");
        
        //增强for
        for (Student student : list) {
            System.out.println(student);
        }
        System.out.println("-------------------------");
        // 普通for循环比遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
