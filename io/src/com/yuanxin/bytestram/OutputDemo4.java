package com.yuanxin.bytestram;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputDemo4 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("bytestream\\a.txt");

        /*byte [] bys = {97,98,99};
        fos.write(bys);*/

        byte [] bys = {97,98,99,100,101,102,103};
        fos.write(bys,1,2);

        fos.close();
    }
}
