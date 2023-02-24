package com.yuanxin.arrayadvance;

public class MyBubbleSortDemo {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
        //1 2 3 4 5

        //第一轮
        //把最大值5找出,并把它放到数组的最右边
        //-1 是为了让索引不超出范围
        for (int i = 0; i < arr.length - 1 - 0; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        printArr(arr);

        //第二轮

        for (int i = 0; i < arr.length - 1 -1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        printArr(arr);
        //第三轮
        for (int i = 0; i < arr.length - 1 -2; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        printArr(arr);
        //第四轮

        for (int i = 0; i < arr.length - 1 -3; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        printArr(arr);
    }

    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
