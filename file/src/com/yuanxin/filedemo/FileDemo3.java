package com.yuanxin.filedemo;


import java.io.File;
import java.io.IOException;

public class FileDemo3 {
    public static void main(String[] args) throws IOException {
        //public boolean createNewFile()    创建一个新的空的文件
                //注意点:
                    //1.如果文件存在,那么创建失败,返回false
                    //2.如果文件不存在,那么创建成功,返回true
                    //3.createNewFile方法不管调用者有没有后缀名,只能创建文件.

        //public boolean mkdir()            创建一个单级文件夹
                //注意点:
                    //1.只能创建单级文件夹,不能创建多级文件夹
                    //2.不管调用者有没有后缀名,只能创建单级文件夹

        //public boolean mkdirs()           创建一个多级文件夹
                //注意点:
                    //1,可以创建单级文件夹,也可以创建多级文件夹
                    //2.不管调用者有没有后缀名,只能创建文件夹

        //疑问:
            //既然mkdirs能创建单级,也能创建多级.那么mkdir还有什么用啊? 是的

        method1();

        method2();
//
//        File file = new File("C:\\itheima\\aaa.txt");
//        boolean result = file.mkdirs();
//        System.out.println(result);


    }

    private static void method2() {
        File file = new File("/Users/xinyuan/100-Major-专业-Pro/102-计算机科学软件、教程及文件/009-Java/learn_java/aaa.txt");
        boolean result = file.mkdir();
        System.out.println(result);
    }

    private static void method1() throws IOException {
        File file1 = new File("/Users/xinyuan/100-Major-专业-Pro/102-计算机科学软件、教程及文件/009-Java/learn_java/aaa.md");
        boolean result1 = file1.createNewFile();
        System.out.println(result1);
    }
}
