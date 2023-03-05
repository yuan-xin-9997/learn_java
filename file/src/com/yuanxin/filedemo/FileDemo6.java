package com.yuanxin.filedemo;


import java.io.File;

public class FileDemo6 {

    public static void main(String[] args) {

       File file = new File("/Users/xinyuan/100-Major-专业-Pro/102-计算机科学软件、教程及文件/009-Java/learn_java/");
        File[] files = file.listFiles();//返回值是一个File类型的数组
        System.out.println(files.length);
        for (File path : files) {
            System.out.println(path);
        }

        //进入文件夹,获取这个文件夹里面所有的文件和文件夹的File对象,并把这些File对象都放在一个数组中返回.
        //包括隐藏文件和隐藏文件夹都可以获取.

        //注意事项:
            //1.当调用者是一个文件时，java.lang.NullPointerException
            //2,当调用者是一个空文件夹时
            //3.当调用者是一个有内容的文件夹时，获取这个文件夹里面所有的文件和文件夹的File对象,并把这些File对象都放在一个数组中返回
            //4.当调用者是一个有权限才能进入的文件夹时，java.lang.NullPointerException

    }
}
