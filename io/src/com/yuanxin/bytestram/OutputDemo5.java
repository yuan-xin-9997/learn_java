package com.yuanxin.bytestram;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputDemo5 {
    public static void main(String[] args) throws IOException {
        //第二个参数就是续写开关,如果没有传递,默认就是false,
        //表示不打开续写功能,那么创建对象的这行代码会清空文件.

        //如果第二个参数为true,表示打开续写功能
        //那么创建对象的这行代码不会清空文件.
        FileOutputStream fos = new FileOutputStream("/Users/xinyuan/100-Major-专业-Pro/102-计算机科学软件、教程及文件/009-Java/learn_java/a.txt",true);

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
    }
}
