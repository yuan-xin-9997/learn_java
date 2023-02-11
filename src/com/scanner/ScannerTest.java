package com.scanner;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int firstNumber = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int secondNumber = sc.nextInt();
        int sum = firstNumber + secondNumber;
        System.out.println("求和结果是：" + sum);
    }
}
