package com.yuanxin.filetest;


import java.io.File;

public class Test2 {
    public static void main(String[] args) {
        //练习二：删除一个多级文件夹
        //delete方法
        //只能删除文件和空文件夹.
        //如果现在要删除一个有内容的文件夹?
        //先删掉这个文件夹里面所有的内容.
        //最后再删除这个文件夹

        File src = new File("/Users/xinyuan/100-Major-专业-Pro/102-计算机科学软件、教程及文件/009-Java/learn_java/aaa");
        deleteDir(src);

    }
    /*
    将src目录中所有的文件和文件夹删除
     */
    private static void deleteDir(File src) {
        //先删掉这个文件夹里面所有的内容.
        //递归 方法在方法体中自己调用自己.
        //注意: 可以解决所有文件夹和递归相结合的题目
        //1.进入 --- 得到src文件夹里面所有内容的File对象.
        File[] files = src.listFiles();
        //2.遍历 --- 因为我想得到src文件夹里面每一个文件和文件夹的File对象.
        for (File file : files) {
            if(file.isFile()){
                //3.判断 --- 如果遍历到的File对象是一个文件,那么直接删除
                file.delete();
                System.out.println(file + "删除成功");
            }else{
                //4.判断
                //递归
                deleteDir(file);//参数一定要是src文件夹里面的文件夹File对象
            }
        }
        //最后再删除这个文件夹
        src.delete();
    }


}
