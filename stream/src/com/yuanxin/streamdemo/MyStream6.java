package com.yuanxin.streamdemo;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Stream流的收集方法
 * 练习:
 * 定义一个集合，并添加一些整数1,2,3,4,5,6,7,8,9,10
 * 将集合中的奇数删除，只保留偶数。
 * 遍历集合得到2，4，6，8，10。
 */
public class MyStream6 {
    public static void main(String[] args) {
        // 构造数据
        // 方法一
        // ArrayList<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));

        // 方法二
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

//        list.stream().filter(
//                (Integer i)->{
//                    return i % 2 == 0;
//                }
//        )

        // 中间方法filter
        list.stream().filter(number -> number % 2 == 0).forEach(number -> System.out.println(number));
        System.out.println("====================");

        for (Integer integer : list) {
            System.out.println(integer);
        }


    }
}
