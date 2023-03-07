package com.yuanxin.convertedio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ConvertedDemo4 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"));
        // 反序列化
        User o = (User) ois.readObject();  // 强行转换
        System.out.println(o); // User{username='zhangsan', password='null'}???  // transient 不将password序列到本地
        ois.close();

    }
}
