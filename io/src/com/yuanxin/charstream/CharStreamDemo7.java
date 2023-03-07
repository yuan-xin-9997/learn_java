package com.yuanxin.charstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo7 {
    public static void main(String[] args) throws IOException {
        //一次读取多个字符。

        //创建对象
        FileReader fr = new FileReader("/Users/xinyuan/100-Major-专业-Pro/102-计算机科学软件、教程及文件/009-Java/黑马Java/learn_java/a.txt");

        //创建一个数组
        char [] chars = new char[1024];
        int len;

        //read方法还是读取，但是是一次读取多个字符
        //他把读到的字符都存入到chars数组。
        //返回值：表示本次读到了多少个字符。
        while((len = fr.read(chars))!=-1){
            System.out.println(new String(chars,0,len));
        }

        fr.close();

        String s = new String("gauge");
        System.out.println(s);
    }
}
