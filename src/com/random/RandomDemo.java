package com.random;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random r = new Random();

        for (int i=1;i<=10;i++){
            int j = r.nextInt(10);
            System.out.println(j);
        }

        // 获取1-100之间的随机数，前面获取0-99，+1就是1-100
        int num = r.nextInt(100) + 1;
        System.out.println(num);
    }
}
