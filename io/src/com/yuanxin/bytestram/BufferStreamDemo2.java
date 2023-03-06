package com.yuanxin.bytestram;

import java.io.*;

public class BufferStreamDemo2 {
    public static void main(String[] args) throws IOException {
        // 利用缓冲流去拷贝文件

        // 创建一个字节缓冲输入流
        // 在底层创建一个默认长度为8192的字节数组
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("/Users/xinyuan/100-Major-专业-Pro/102-计算机科学软件、教程及文件/009-Java/黑马Java/learn_java/a.txt"));
        // 创建一个字节缓冲输出流
        // 在底层创建一个默认长度为8192的字节数组（FileOutputStream会自动创建文件，如果不存在）
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("/Users/xinyuan/100-Major-专业-Pro/102-计算机科学软件、教程及文件/009-Java/黑马Java/learn_java/b.txt"));

        byte [] bytes = new byte[1024];
        int len;
        while((len = bis.read(bytes)) != -1){
            bos.write(bytes, 0, len);
        }
        // 方法会将字节输入输出流关闭
        bis.close();
        bos.close();

        System.out.println("======================");
        int [] arr = new int[10];
        arr[0] = 1;
        System.out.println(arr.length);
    }
}
