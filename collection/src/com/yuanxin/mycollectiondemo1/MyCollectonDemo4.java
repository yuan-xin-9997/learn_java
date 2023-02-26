package com.yuanxin.mycollectiondemo1;

import java.util.ArrayList;

public class MyCollectonDemo4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("b");
        list.add("e");

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if("b".equals(s)){
                list.remove(i);
                i--;// 集合删除元素之后，长度会自动减1
            }
        }

        System.out.println(list);
    }
}
