package com.yuanxin.convertedio;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ConvertedDemo2 {
    public static void main(String[] args) throws IOException {
        User user = new User("zhangsan","qwer");
        //需求:把这个用户信息保存到本地文件去.
        BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));
        bw.write(user.getUsername());
        bw.newLine();
        bw.write(user.getPassword());
        bw.close();
    }
}
