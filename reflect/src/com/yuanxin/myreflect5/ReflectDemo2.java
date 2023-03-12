package com.yuanxin.myreflect5;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 获取Method对象并运行
 */
public class ReflectDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
//        Object invoke(Object obj, Object... args)：运行方法
//        参数一：用obj对象调用该方法
//        参数二：调用方法的传递的参数（如果没有就不写）
//        返回值：方法的返回值（如果没有就不写）

        //1.获取class对象
        Class clazz = Class.forName("com.yuanxin.myreflect5.Student");

        //2.获取里面的Method对象  function4
        Method method = clazz.getMethod("function4", String.class);  // 这里获取String的class对象，用的是String.class。原因是因为String已经加载到内存中了

        //3.运行function4方法就可以了
        //3.1创建一个Student对象,当做方法的调用者
        Student student = (Student) clazz.newInstance();
        //3.2运行方法
        Object result = method.invoke(student, "zhangsan");

        //4.打印一下返回值
        System.out.println(result);
    }
}
