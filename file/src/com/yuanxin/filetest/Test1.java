package com.yuanxin.filetest;


import java.io.File;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        //练习一：在当前模块下的aaa文件夹中创建一个a.txt文件
       /* File file = new File("filemodule\\aaa\\a.txt");
        file.createNewFile();*/
        //注意点:文件所在的文件夹必须要存在.

        File file = new File("/Users/xinyuan/100-Major-专业-Pro/102-计算机科学软件、教程及文件/009-Java/learn_java/aaa");
        if(!file.exists()){
            //如果文件夹不存在,就创建出来
            System.out.println(file.mkdirs());
        }
        File newFile = new File(file,"a.txt");
        System.out.println(newFile.createNewFile());;
    }
}
