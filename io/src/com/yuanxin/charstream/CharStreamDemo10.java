package com.yuanxin.charstream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo10 {
    public static void main(String[] args) throws IOException {
        //字符缓冲输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/xinyuan/100-Major-专业-Pro/102-计算机科学软件、教程及文件/009-Java/黑马Java/learn_java/a.txt"));

        //写出数据
        //实际写出的是97对应的字符a
        bw.write(97);
        bw.write("\r\n");

        //实际写出的是97 - 101 对应的字符 abcde
        char [] chars = {97,98,99,100,101};
        bw.write(chars);
        bw.write("\r\n");

        //实际写的是abc
        bw.write(chars,0,3);
        bw.write("\r\n");

        //会把字符串的内容原样写出
        bw.write("黑马程序员");
        bw.write("\r\n");

        //会把字符串的一部分写出 abcde
        String line = "abcdefg";
        bw.write(line,0,5);

        bw.flush();

        bw.close();

    }
}
