package com.yuanxin.bytestram;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/*
提高复制速度
 */

public class OutputDemo10 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/Users/xinyuan/100-Major-专业-Pro/102-计算机科学软件、教程及文件/009-Java/黑马Java/learn_java/a.txt");

        // 下面会自动创建文件，如果文件不存在，TODO：FileOutputStream源码如何调用的创建文件？？？
        FileOutputStream fos = new FileOutputStream("/Users/xinyuan/100-Major-专业-Pro/102-计算机科学软件、教程及文件/009-Java/黑马Java/learn_java/b.txt");

        byte [] bytes = new byte[1024];
        int len; //本次读到的有效字节个数 -- 这次读了几个字节.

        while((len = fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }

        fis.close();
        fos.close();
    }
}
