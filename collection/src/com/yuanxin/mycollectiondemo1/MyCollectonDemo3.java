package com.yuanxin.mycollectiondemo1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class  MyCollectonDemo3 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");


        //1,获得迭代器的对象
        //迭代器对象一旦被创建出来,默认指向集合的0索引处
        // <>里面的是泛型，需要跟list中的元素保持一致，就是String
        Iterator<String> it = list.iterator();


        //利用迭代器里面的方法进行遍历
        //当前位置是否有元素可以被取出
        System.out.println(it.hasNext());
//        //取出当前位置的元素  + 将迭代器往后移动一个索引的位置
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());


        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(it.hasNext());// java.util.NoSuchElementException
        System.out.println(it.next());
    }
}
