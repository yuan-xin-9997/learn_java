package com.yuanxin.variableparameter;

/**
 * 需求：定义一个方法求两个数的和
 * <p>
 * 需求：定义一个方法求三个数的和
 */
public class MyVariableParameter1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int sum1 = getSum(a, b);
        System.out.println(sum1);

        int sum2 = getSum(a, b, c);
        System.out.println(sum2);

    }

    public static int getSum(int a, int b) {
        return a + b;
    }

    public static int getSum(int a, int b, int c) {
        return a + b + c;
    }
}
