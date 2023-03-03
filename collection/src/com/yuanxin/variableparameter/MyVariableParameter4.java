package com.yuanxin.variableparameter;

import java.util.*;

public class MyVariableParameter4 {
    public static void main(String[] args) {
        // static <E>  List<E>  of(E…elements)  创建一个具有指定元素的List集合对象
        //static <E>  Set<E>  of(E…elements)    创建一个具有指定元素的Set集合对象
        //static <K , V>   Map<K，V>  of(E…elements) 创建一个具有指定元素的Map集合对象

        method1();
        method2();

        method3();

        method4();
        System.out.println("");

    }

    private static void method4() {
        Map<String, String> map = Map.ofEntries(
                Map.entry("zhangsan", "江苏"),
                Map.entry("lisi", "北京11111"));
        System.out.println(map);
    }

    private static void method3() {
        Map<String, String> map = Map.of("zhangsan", "江苏", "lisi", "北京", "wangwu", "天津");
        System.out.println(map);
    }

    private static void method2() {
        //传递的参数当中，不能存在重复的元素。
//        Set<String> set = Set.of("a", "b", "c", "d","a");
        Set<String> set = Set.of("a", "b", "c", "d");

        System.out.println(set);
    }

    private static void method1() {
        List<String> list = List.of("a", "b", "c", "d");
        System.out.println(list);
        //list.add("Q");
        //list.remove("a");
        //list.set(0,"A");
        //System.out.println(list);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("aaa");
        list2.add("aaa");
        list2.add("aaa");
        list2.add("aaa");

//        集合的批量添加
//        首先是通过调用List.of方法来创建一个不可变的集合，of方法的形参就是一个可变参数。
//        再创建一个ArrayList集合，并把这个不可变的集合中所有的数据，都添加到ArrayList中。
        ArrayList<String> list3 = new ArrayList<>(List.of("a", "b", "c", "d", "ddd"));
        System.out.println(list3);
    }
}
