package com.yuanxin.test;

import java.io.*;
import java.util.Properties;

public class Test {
    //1.将姓名和年龄手动保存在本地properties文件中
    //2.读取本地properties文件中的数据
    //3.将集合中的数据获取出来并创建对象
    //4.将该对象写到本地
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        FileReader fr = new FileReader("prop.properties");
        prop.load(fr);
        fr.close();

        String name = (String) prop.get("name");
        int age = Integer.parseInt((String) prop.get("age"));
        Student s = new Student(name,age);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.txt"));
        oos.writeObject(s);
        oos.close();

    }
}
