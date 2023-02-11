package com.random;


import java.util.Random;
import java.util.Scanner;

public class RandomTest {
    public static void main(String[] args) {
        Random r = new Random();
        int number = r.nextInt(100) + 1;
        System.out.println("系统已经产生一个1-100之间的数字");
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你猜得数字");
            int guestNumber = sc.nextInt();
            if (guestNumber > number) {
                System.out.println("你猜的数据大了");
            } else if (guestNumber < number) {
                System.out.println("你猜的数据小了");
            } else {
                System.out.println("恭喜你猜中了");
                break;
            }
        }
    }
}
