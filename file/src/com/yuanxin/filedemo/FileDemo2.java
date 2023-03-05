package com.yuanxin.filedemo;

import java.io.File;

public class FileDemo2 {
    public static void main(String[] args) {
        //这个路径固定不变了. 绝对路径
       File file = new File("D:\\itheima\\a.txt");

       //当前项目下的a.txt，相对路径
       File file2 = new File("a.txt");


       //当前项目下 --- 指定模块下的 a.txt，相对路径
       File file3 = new File("filemodule\\a.txt");
    }
}
