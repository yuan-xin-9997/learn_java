package com.yuanxin.bytestram;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputDemo10 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\itheima\\a.avi");
        FileOutputStream fos = new FileOutputStream("bytestream\\a.avi");

        byte [] bytes = new byte[1024];
        int len; //本次读到的有效字节个数 -- 这次读了几个字节.

        while((len = fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }

        fis.close();
        fos.close();
    }
}
