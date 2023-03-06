package com.yuanxin.charstream;

import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo4 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("charstream\\a.txt");

        //fw.write("黑马程序员");
        //fw.write(97);
        fw.write("97");

        fw.close();
    }
}
