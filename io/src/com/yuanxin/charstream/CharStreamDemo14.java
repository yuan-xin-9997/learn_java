package com.yuanxin.charstream;

import java.io.*;
import java.util.Arrays;

public class CharStreamDemo14 {
    public static void main(String[] args) throws IOException {
        //需求：读取文件中的数据，排序后再次写到本地文件
        //分析：
        //1.要把文件中的数据读取进来。
        BufferedReader br = new BufferedReader(new FileReader("charstream\\sort.txt"));

        //输出流一定不能写在这里，因为会清空文件中的内容！！！！
        //BufferedWriter bw = new BufferedWriter(new FileWriter("charstream\\sort.txt"));

        String line = br.readLine();
        System.out.println("读取到的数据为" + line);
        br.close();

        //2.按照空格进行切换
        String[] split = line.split(" ");//9 1 2 5 3 10 4 6 7 8
        //3.把字符串类型的数组变成int类型
        int [] arr = new int[split.length];
        //遍历split数组，可以进行类型转换。
        for (int i = 0; i < split.length; i++) {
            String smallStr = split[i];
            //类型转换
            int number = Integer.parseInt(smallStr);
            //把转换后的结果存入到arr中
            arr[i] = number;
        }
        //4.排序
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


        //5.把排序之后结果写回到本地 1 2 3 4...
        BufferedWriter bw = new BufferedWriter(new FileWriter("charstream\\sort.txt"));
        //写出
        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i] + " ");
            bw.flush();
        }
        //释放资源
        bw.close();


    }
}
