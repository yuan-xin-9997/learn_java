package com.yuanxin.charstream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo11 {
    public static void main(String[] args) throws IOException {
        //字符缓冲流的特有功能
        //字符缓冲输出流BufferedWrite ： newLine  跨平台的换行符


        //创建对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/xinyuan/100-Major-专业-Pro/102-计算机科学软件、教程及文件/009-Java/黑马Java/learn_java/a.txt"));


        //写数据
        bw.write("黑马程序员666");
        //跨平台的回车换行
        bw.newLine();
        bw.write("abcdef");
        //跨平台的回车换行
        bw.newLine();
        bw.write("-------------");

        //刷新流
        bw.flush();
        //释放资源
        bw.close();
    }
}
