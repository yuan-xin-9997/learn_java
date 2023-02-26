package com.yuanxin.mylistdemo1;

import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkedListDemo3 {
    public static void main(String[] args) {
        LinkedList<String>  list = new LinkedList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        // 三种for循环
        // 顶层类的共性，底层类的特性
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("-------------------------");

        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }

        System.out.println("--------------------------");

        for (String s : list) {
            System.out.println(s);
        }
    }
}
