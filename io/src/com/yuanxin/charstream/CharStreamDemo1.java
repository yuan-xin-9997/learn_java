package com.yuanxin.charstream;

import java.io.FileInputStream;
import java.io.IOException;
/*
为什么有了字节流，还要字符流
是因为，字节流中文会乱码
 */

public class CharStreamDemo1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/Users/xinyuan/100-Major-专业-Pro/102-计算机科学软件、教程及文件/009-Java/黑马Java/learn_java/a.txt");
        int b ;
        while((b = fis.read()) != -1){
            System.out.println((char) b);
        }
        fis.close();
    }
}
