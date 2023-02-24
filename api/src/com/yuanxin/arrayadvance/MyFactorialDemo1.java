package com.yuanxin.arrayadvance;

import java.lang.reflect.Array;

public class MyFactorialDemo1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

        int [] arr = new int[5];
        if (arr instanceof Array){
            System.out.println("hh");
        }
    }
}
