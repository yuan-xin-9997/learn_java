package com.yuanxin.charstream;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CharStreamDemo2 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        method1();
        System.out.println("==========================");
        // 下面演示解码的过程
        // String(byte[] bytes)：
                //通过使用平台的默认字符集解码指定的字节数组来构造新的 String
       // String(byte[] bytes, String charsetName)：
                //通过指定的字符集解码指定的字节数组来构造新的 String
        //UTF-8
        byte [] bytes1 = {-23, -69, -111, -23, -87, -84, -25, -88, -117, -27, -70, -113, -27, -111, -104, -126, -111, -110};
        //gbk
        byte [] bytes2 = {-70, -38, -62, -19, -77, -52, -48, -14, -44, -79};

        //利用默认的UTF-8进行解码
        String s1 = new String(bytes1);
        System.out.println(s1);//黑马程序员

        //利用指定的GBK进行解码
        String s2 = new String(bytes2,"gbk");
        System.out.println(s2);//黑马程序员

    }


    // 演示编码的过程
    private static void method1() throws UnsupportedEncodingException {
        // byte[] getBytes()：
        //使用平台的默认字符集将该 String编码为一系列字节，将结果存储到新的字节数组中
        // byte[] getBytes(String charsetName)：
        //使用指定的字符集将该 String编码为一系列字节，将结果存储到新的字节数组中

        String s = "黑马程序员";
        //利用idea默认的UTF-8将中文编码为一系列的字节
        byte[] bytes1 = s.getBytes();
        System.out.println(Arrays.toString(bytes1));

//        byte[] bytes2 = s.getBytes("UTF-8");
        byte[] bytes2 = s.getBytes("GBK");
        System.out.println(Arrays.toString(bytes2));
    }
}
