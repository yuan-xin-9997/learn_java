package com.yuanxin.bytestram;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputDemo7 {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/xinyuan/100-Major-专业-Pro/102-计算机科学软件、教程及文件/009-Java/黑马Java/learn_java/a.txt");
        System.out.println(file.createNewFile());
        FileOutputStream fos = new FileOutputStream("/Users/xinyuan/100-Major-专业-Pro/102-计算机科学软件、教程及文件/009-Java/黑马Java/learn_java/a.txt");
        fos.write(97);
        //能加一个换行
        fos.write("\r".getBytes());
        fos.write(98);
        //能加一个换行
        fos.write("\r\n".getBytes());
        fos.write(99);
        //能加一个换行
        fos.write("\r\n".getBytes());
        fos.write(100);
        //能加一个换行
        fos.write("\r\n".getBytes());
        fos.write(101);
        //能加一个换行
        fos.write("\r\n".getBytes());
        fos.close();
        //=====================================================================================================

        //如果文件存在,那么就不会报错.
        //如果文件不存在,那么就直接报错.
        FileInputStream fis = new FileInputStream("/Users/xinyuan/100-Major-专业-Pro/102-计算机科学软件、教程及文件/009-Java/黑马Java/learn_java/a.txt");

        int read = fis.read();
        //一次读取一个字节,返回值就是本次读到的那个字节数据.
        //也就是字符在码表中对应的那个数字.
        //如果我们想要看到的是字符数据,那么一定要强转成char


        System.out.println((char)read);

        //释放资源
        fis.close();
    }
}
