package com.yuanxin.mytreeset;
/*
 使用 String类的compareTo方法
 */
public class MyTreeSet3 {
    public static void main(String[] args) {
        String s1 = "aaa";
        String s2 = "abc";

        System.out.println(s1.compareTo(s2));
        //首先比较第一个字母，如果第一个字母是一样的，那么继续比较后面的字母
        //当不一样的时候，就拿着对应的码表值97，减去 b的码表值 98
        //认为a是比b要小的。
    }
}
