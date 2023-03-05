package com.yuanxin.bytestram;


import java.io.FileInputStream;
import java.io.IOException;

public class OutputDemo7 {
    public static void main(String[] args) throws IOException {
        //如果文件存在,那么就不会报错.
        //如果文件不存在,那么就直接报错.
        FileInputStream fis = new FileInputStream("bytestream\\a.txt");

        int read = fis.read();
        //一次读取一个字节,返回值就是本次读到的那个字节数据.
        //也就是字符在码表中对应的那个数字.
        //如果我们想要看到的是字符数据,那么一定要强转成char


        System.out.println((char)read);

        //释放资源
        fis.close();
    }
}
