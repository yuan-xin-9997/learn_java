package com.yuanxin.mytreeset;

import java.util.TreeSet;

/**
 * TreeSet集合来存储Integer类型
 */
public class MyTreeSet1 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(5);
        ts.add(3);
        ts.add(4);
        ts.add(1);
        ts.add(2);

        System.out.println(ts);//[1, 2, 3, 4, 5] 已经排好序
    }
}
