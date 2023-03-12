package com.yuanxin.myanno4;

public class StudentDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取到Student类的字节码文件对象
        Class clazz = Class.forName("com.yuanxin.myanno4.Student");

        //获取注解。
        boolean result = clazz.isAnnotationPresent(Anno.class);// 查看clazz类对象是否有Anno.class注解
        System.out.println(result);
    }
}
