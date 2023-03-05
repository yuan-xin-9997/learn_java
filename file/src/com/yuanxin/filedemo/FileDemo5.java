package com.yuanxin.filedemo;


import java.io.File;

public class FileDemo5 {
    //public boolean isDirectory()  测试此抽象路径名表示的File是否为目录
    //public boolean isFile()       测试此抽象路径名表示的File是否为文件
    //public boolean exists()       测试此抽象路径名表示的File是否存在
    //public String getName()       返回由此抽象路径名表示的文件或目录的名称
                //注意点:
                    //1.如果调用者是文件,那么获取的是文件名和后缀名
                    //2.如果调用者是一个文件夹,那么获取的是文件夹的名字
    public static void main(String[] args) {
        method1();
        method2();

        method3();

        File file = new File("README.md");
        String name = file.getName();
        System.out.println(name);

        File file1 = new File("/Users/xinyuan/100-Major-专业-Pro/102-计算机科学软件、教程及文件/009-Java/learn_java/");
        String name2 = file1.getName();
        System.out.println(name2);


    }

    private static void method3() {
        File file = new File("README.md");
        boolean result = file.exists();
        System.out.println(result);
    }

    private static void method2() {
        File file = new File("/Users/xinyuan/100-Major-专业-Pro/102-计算机科学软件、教程及文件/009-Java/learn_java/file");
        boolean result1 = file.isFile();
        boolean result2 = file.isDirectory();
        System.out.println(result1);
        System.out.println(result2);
    }

    private static void method1() {
        File file = new File("/Users/xinyuan/100-Major-专业-Pro/102-计算机科学软件、教程及文件/009-Java/learn_java/a.txt");
        boolean result1 = file.isFile();
        boolean result2 = file.isDirectory();
        System.out.println(result1);
        System.out.println(result2);
    }


}
