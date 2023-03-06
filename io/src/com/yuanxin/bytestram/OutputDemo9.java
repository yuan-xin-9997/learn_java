package com.yuanxin.bytestram;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/*
复制文件
 */

public class OutputDemo9 {
    public static void main(String[] args) throws IOException {
        //创建了字节输入流,准备读数据.
        FileInputStream fis = new FileInputStream("/Users/xinyuan/100-Major-专业-Pro/102-计算机科学软件、教程及文件/009-Java/黑马Java/learn_java/a.txt");
        //创建了字节输出流,准备写数据.
        FileOutputStream fos = new FileOutputStream("/Users/xinyuan/100-Major-专业-Pro/102-计算机科学软件、教程及文件/009-Java/黑马Java/learn_java/a的副本.txt");

        int b;
        while((b = fis.read())!=-1){
            fos.write(b);
        }

        fis.close();
        fos.close();
    }
}
