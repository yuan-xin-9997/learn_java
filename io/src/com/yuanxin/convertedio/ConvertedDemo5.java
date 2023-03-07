package com.yuanxin.convertedio;

import java.io.*;
import java.util.ArrayList;

public class ConvertedDemo5 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //1.写对象
        //2.修改javabean类
        //3.读对象

        //写对象 --- 序列化
        method1();

        //读对象 --- 反序列化
       method2();


       //serialVersionUID 序列号
        //如果我们自己没有定义,那么虚拟机会根据类中的信息会自动的计算出一个序列号.
        //问题:如果我们修改了类中的信息.那么虚拟机会再次计算出一个序列号.

        //第一步:把User对象序列化到本地. --- -5824992206458892149
        //第二步:修改了javabean类. 导致 --- 类中的序列号 4900133124572371851
        //第三步:把文件中的对象读到内存. 本地中的序列号和类中的序列号不一致了.

        //解决?
        //不让虚拟机帮我们自动计算,我们自己手动给出.而且这个值不要变.
    }

    private static void method2() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"));
        User o = (User) ois.readObject();
        System.out.println(o);
        ois.close();
    }

    private static void method1() throws IOException {
        User user = new User("zhangsan","qwer");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.txt"));
        oos.writeObject(user);
        oos.close();
    }
}
