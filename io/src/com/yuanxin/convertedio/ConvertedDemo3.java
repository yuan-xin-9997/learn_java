package com.yuanxin.convertedio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ConvertedDemo3 {
    public static void main(String[] args) throws IOException {
        User user = new User("zhangsan","qwer");
        // 序列化
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.txt"));
        oos.writeObject(user);
        oos.close();


    }
}
