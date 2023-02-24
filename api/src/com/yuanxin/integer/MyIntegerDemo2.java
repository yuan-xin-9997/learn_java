package com.yuanxin.integer;

public class MyIntegerDemo2 {
    public static void main(String[] args) {
//        public Integer(int value)   		根据int创建Integer对象(过时)
//public Integer(String s)    		根据String值创建Integer对象(过时)
        Integer i1 = new Integer(100);
        Integer i2 = new Integer("100");
        System.out.println(i1);
        System.out.println(i2);


//        public static Integer valueOf​(int i)    返回表示指定的int值的Integer实例
//        public static Integer valueOf​(String s) 返回一个保存指定值的Integer对象String

        Integer i3 = Integer.valueOf(200);
        int i5 = 200;
        Integer i4 = Integer.valueOf("200");
        System.out.println(i3);
        System.out.println(i5);
        System.out.println(i4);

    }
}
