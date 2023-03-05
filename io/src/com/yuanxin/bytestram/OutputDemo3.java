package com.yuanxin.bytestram;


import java.io.FileOutputStream;
import java.io.IOException;

public class OutputDemo3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("bytestream\\a.txt");
        fos.write(97);
        fos.write(98);
        fos.write(99);

        fos.close();

    }
}
