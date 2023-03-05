package com.yuanxin.bytestram;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputDemo2 {
    public static void main(String[] args) throws IOException {
        //1.创建字节输出流的对象
                        //注意点:如果文件不存在,会帮我们自动创建出来.
                        //       如果文件存在,会把文件清空.
        FileOutputStream fos = new FileOutputStream("/Users/xinyuan/100-Major-专业-Pro/102-计算机科学软件、教程及文件/009-Java/learn_java/a.txt");

        //2,写数据     传递一个整数时,那么实际上写到文件中的,是这个整数在码表中对应的那个字符.
        fos.write(99);

        //3,释放资源
        fos.close(); //告诉操作系统,我现在已经不要再用这个文件了.
//        while(true){
//
//        }
    }
}
