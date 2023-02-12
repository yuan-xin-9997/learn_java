package com.array;

import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第"+(i+1)+"个元素");
            arr[i] = sc.nextInt();
        }
        printArray(arr);
    }

//    public static void  printArray(int[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//    }

    public static void  printArray(int[] arr){
        System.out.print("[");;
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                System.out.print(arr[i]);//输出元素，不换行
            }else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.print("]");
    }
}
