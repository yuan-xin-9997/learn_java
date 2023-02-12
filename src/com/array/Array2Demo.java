package com.array;

public class Array2Demo {
    public static void main(String[] args) {
        // 二维数组
        // 静态初始化
//        int[][] arr = new int[][] {{1,2,3}, {1,2,3}, {4,5,6,7,8,9}};
        int[][] arr =  {{1,2,3}, {1,2,3}, {4,5,6,7,8,9}};
        // 动态初始化
        int[][] arr1 = new int[2][3];

        // 访问，赋值
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);
        arr[0][0] = 100;
        arr[0][1] = 101;
        arr[0][2] = 102;
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);
        
        //遍历
        for (int i = 0; i < arr.length; i++) {
            for (int i1 = 0; i1 < arr[i].length; i1++) {
                System.out.println(arr[i][i1]);
            }
        }
    }
}
