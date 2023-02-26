package com.yuanxin.genericitysummarize;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/**
 *  不写泛型的弊端
 */
public class GenericitySummarize {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add(123);// 集合添加了不同数据类型的对象，但是没有报错，因为没有添加泛型，如果添加泛型为ArrayList<String> list = new ArrayList()的话，编译期间就会报错

        Iterator it = list.iterator();
        while(it.hasNext()){
//            String next = (String) it.next();// 此处必须使用强制转换
//            int len = next.length();
            Object next = it.next();
//            System.out.println(len);
            System.out.println(next);
        }
    }
}
