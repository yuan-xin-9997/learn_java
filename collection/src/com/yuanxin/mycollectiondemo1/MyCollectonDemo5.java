package com.yuanxin.mycollectiondemo1;

import java.util.ArrayList;
import java.util.Iterator;

public class MyCollectonDemo5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("d");

        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            if("b".equals(s)){
                //指向谁,那么此时就删除谁.
                it.remove();// 此处不用i--，和集合删除元素之后，长度会自动减1，不一样
            }
        }
        System.out.println(list);
    }
}
