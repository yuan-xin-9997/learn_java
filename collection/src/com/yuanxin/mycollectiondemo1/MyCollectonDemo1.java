package com.yuanxin.mycollectiondemo1;

import java.util.ArrayList;
import java.util.Arrays;

public class MyCollectonDemo1 {
    public static void main(String[] args) {
        //数组可以存储基本数据类型也可以存储引用数据类型
        int [] arr1 = {1,2,3};
        String [] arr2 = {"a","b","c"};
        System.out.println(arr1);//打印地址
        System.out.println(arr2);//打印地址
        System.out.println(Arrays.toString(arr1));//打印所有元素
        System.out.println(Arrays.toString(arr2));//打印所有元素

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        System.out.println(list1);// 打印所有元素

        // 集合只能存引用数据类型
        //如果集合要存储基本数据类型,那么实际存储的是他们的包装类，也就是把泛型改为Integer，即<>之中的内容
        //ArrayList<int> list2 = new ArrayList<int>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        System.out.println(list2);// 打印所有元素
    }
}
