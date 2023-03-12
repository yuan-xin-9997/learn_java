package com.yuanxin.myclassloader;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ClassLoaderDemo2 {
    public static void main(String[] args) throws IOException {
//        File f = new File("");
//        System.out.println(f.getAbsolutePath());



        //static ClassLoader getSystemClassLoader() 获取系统类加载器
        //InputStream getResourceAsStream(String name)  加载某一个资源文件

        //获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();

        //利用加载器去加载一个指定的文件
        //参数：文件的路径
        //返回值：字节流。
//        E:\IdeaProject\learn_java\classloader\src\prop.properties
        InputStream is = systemClassLoader.getResourceAsStream("prop.properties");
        System.out.println(is);

        Properties prop = new Properties();
        prop.load(is);

        System.out.println(prop);

        is.close();
    }
}
