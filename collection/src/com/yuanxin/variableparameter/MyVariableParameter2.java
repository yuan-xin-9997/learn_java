package com.yuanxin.variableparameter;

/**
 * 需求：定义一个方法求N个数的和
 */
public class MyVariableParameter2 {
    public static void main(String[] args) {
        //在JDK5之前，会把所有的数据都先放到一个数组中
        //我们自己定义的方法，形参只要写一个数组就可以了。

        int [] arr = {1,2,3,4,5};
        int sum1 = getSum(arr);
        System.out.println(sum1);
    }

    private static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
