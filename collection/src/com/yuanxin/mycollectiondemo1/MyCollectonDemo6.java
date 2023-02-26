package com.yuanxin.mycollectiondemo1;

import java.util.ArrayList;

public class MyCollectonDemo6 {
    public static void main(String[] args) {
        ArrayList<String> list =  new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        Integer i = new Integer(1);
        Integer j = Integer.valueOf(1);
//        list.add(i);// Java集合数据类型必须是一致的，和Python的list不一样

        // 增强for循环，基于迭代器的

        //1,数据类型一定是集合或者数组中元素的类型
        //2,str仅仅是一个变量名而已,在循环的过程中,依次表示集合或者数组中的每一个元素
        //3,list就是要遍历的集合或者数组.
        for(String k: list){
            System.out.println(k);
        }
    }
}
