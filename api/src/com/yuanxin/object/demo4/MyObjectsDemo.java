package com.yuanxin.object.demo4;

import java.util.Objects;

public class MyObjectsDemo {
    public static void main(String[] args) {
//        public static String toString(对象)  		 返回参数中对象的字符串表示形式。
        Student s = new Student("小罗同学",50);
        String result = Objects.toString(s);
        System.out.println(result);
        System.out.println(s);


//        public static String toString(对象, 默认字符串)  返回对象的字符串表示形式。如果对象为空,那么返回第二个参数.
        //Student s = new Student("小花同学",23);
        Student s1 = null;
        String result1 = Objects.toString(s1, "随便写一个");
        System.out.println(result1);

//        public static Boolean isNull(对象)		 判断对象是否为空
        Student s2 = null;
        Student s3 = new Student();
        boolean result2 = Objects.isNull(s2);
        System.out.println(result2);
        boolean result3 = Objects.isNull(s3);
        System.out.println(result3);


//        public static Boolean nonNull(对象)		 判断对象是否不为空
        //Student stun = new Student();
        Student stun = null;
        boolean results = Objects.nonNull(stun);
        System.out.println(results);

    }
}
