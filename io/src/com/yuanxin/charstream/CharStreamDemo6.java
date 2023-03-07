package com.yuanxin.charstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo6 {
    public static void main(String[] args) throws IOException {
        //创建字符输入流的对象
       // FileReader fr = new FileReader(new File("charstream\\a.txt"));
        FileReader fr = new FileReader("/Users/xinyuan/100-Major-专业-Pro/102-计算机科学软件、教程及文件/009-Java/黑马Java/learn_java/a.txt");


        //读取数据
        //一次读取一个字符
        int ch;
        while((ch = fr.read()) != -1){
            System.out.println((char) ch);
        }

        //释放资源
        fr.close();
    }
}
