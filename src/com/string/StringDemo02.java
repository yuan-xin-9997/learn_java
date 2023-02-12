package com.string;

/*
    int length()：返回此字符串的长度
    boolean equals(Object anObject)：将此字符串与指定的对象进行比较
    boolean equalsIgnoreCase(String anotherString)：将此 String与另一个 String比较，忽略了大小写
    String trim()：返回一个字符串，其值为此字符串，删除了所有前导和尾随空格
 */
public class StringDemo02 {
    public static void main(String[] args) {
        String s1 = "itheima";
        String s2 = "itheima";
        String s3 = "Itheima";

        //boolean equals(Object anObject)：将此字符串与指定的对象进行比较
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        //boolean equalsIgnoreCase(String anotherString)：将此 String与另一个 String比较，忽略了大小写
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println("-------------------");

        String s4 = " itheima ";
        //String trim()：返回一个字符串，其值为此字符串，删除了所有前导和尾随空格
        System.out.println(s4);
        System.out.println(s4.trim());

        String s5 = "it heima";
        System.out.println(s5.trim());
    }
}
