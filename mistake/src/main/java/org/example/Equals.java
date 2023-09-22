package org.example;

public class Equals {

    public static void test1(){
        // Java 数据类型深入（String、基本数据类型、包装数据类型、引用数据类型，从内存角度理解，设计思想）

        // java == equals方法，对基本数据类型，包装数据类型，引用数据类型的比较差异
        /*  ref https://zhuanlan.zhihu.com/p/107733987

        * 基本数据类型（也称原始数据类型） ：byte,short,char,int,long,float,double,boolean。他们之间的比较，应用双等号（==）,比较的是他们的值。
        * 引用数据类型：当他们用（==）进行比较的时候，比较的是他们在内存中的存放地址（确切的说，是堆内存地址）。
        */
        System.out.println("1===================================");
        // 基本数据类型 == 比较值是否相同
        int a = 1;
        int b = 1;
        System.out.println(a == b);

        System.out.println("2===================================");

        Integer a1 = 1;
        Integer b1 = 1;
        System.out.println(a1 == b1); //true
        System.out.println(a1.equals(b1));// true

        Integer a2 = 127;
        Integer b2 = 127;
        System.out.println(a2 == b2);//true
        System.out.println(a2.equals(b2));//true

        Integer a3 = 128;
        Integer b3 = 128;
        System.out.println(a3 == b3);//false
        System.out.println(a3.equals(b3));//true

        Integer i = new Integer(100);
        Integer j = new Integer(100);
        System.out.println("i == j:" + (i == j)); //false
        System.out.println("i.equals(j):" + (i.equals(j))); //true
        System.out.println("i.hashCode():" + i.hashCode());
        System.out.println("j.hashCode():" + j.hashCode());
        System.out.println("i,it's memory address:" + System.identityHashCode(i));
        System.out.println("j,it's memory address:" + System.identityHashCode(j));

        System.out.println("3===================================");

        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1 == s2);   // true
        System.out.println(s1.equals(s2));   // true

        String str1 = "Hello";
        String str2 = new String("Hello");
        String str3 = str2; // 引用传递
        System.out.println(str1 == str2); // false
        System.out.println(str1 == str3); // false
        System.out.println(str2 == str3); // true
        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equals(str3)); // true
        System.out.println(str2.equals(str3)); // true
    }
}
