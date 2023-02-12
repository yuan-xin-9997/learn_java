package com.array;

public class ArrayDemo {
    public static void main(String[] args) {
//        数组静态初始化
//        int[] scores = new int[]{1,2,3};
        int[] score = {1,2,3};
//        score = null;
        System.out.println(score);
        System.out.println(score[0]);
        System.out.println(score[1]);
        System.out.println(score[2]);
        score[0] = 100;
        System.out.println(score[0]);

        int[] arr = {12, 45, 98, 73, 60};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // 数组动态初始化
        int[] arr1 = new int[3];
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
    }
}
