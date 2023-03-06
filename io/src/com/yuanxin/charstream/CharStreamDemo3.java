package com.yuanxin.charstream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo3 {
    public static void main(String[] args) throws IOException {

        //创建字符输出流的对象
        //FileWriter fw = new FileWriter(new File("charstream\\a.txt"));
        FileWriter fw = new FileWriter("/Users/xinyuan/100-Major-专业-Pro/102-计算机科学软件、教程及文件/009-Java/黑马Java/learn_java/a.txt");


        //写出数据
        //void write(int c)            写一个字符
        fw.write(97);
        fw.write(98);
        fw.write(99);


        //void write(char[] cbuf)      写出一个字符数组
        char [] chars = {97,98,99,100,101};
        fw.write(chars);


        //void write(char[] cbuf, int off, int len)    写出字符数组的一部分
        char [] chars2 = {97,98,99,100,101};
        fw.write(chars2,0,3);


        //void write(String str)       写一个字符串
       String line = "黑马程序员abc";
        fw.write(line);


        //void write(String str, int off, int len)     写一个字符串的一部分
        String line1 = "黑马程序员abc";
        fw.write(line1,0,2);

        //释放资源
        fw.close();

    }
}
