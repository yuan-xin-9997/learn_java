package com.yuanxin.charstream;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CharStreamDemo8 {
    public static void main(String[] args) throws IOException {
        //将键盘录入的用户名和密码保存到本地实现永久化存储
        //要求：用户名独占一行，密码独占一行

        //分析：
        //1，实现键盘录入，把用户名和密码录入进来
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入用户名");
        String username = sc.next();
        System.out.println("请录入密码");
        String password = sc.next();

        //2.分别把用户名和密码写到本地文件。
        FileWriter fw = new FileWriter("charstream\\a.txt");
        //将用户名和密码写到文件中
        fw.write(username);
        //表示写出一个回车换行符 windows \r\n  MacOS \r  Linux \n
        fw.write("\r\n");
        fw.write(password);
        //刷新流
        fw.flush();
        //释放资源
        fw.close();
    }
}
