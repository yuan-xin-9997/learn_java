package com.yuanxin.mapdemo1;

import java.util.HashMap;
import java.util.Map;

/**
 * Map的基本使用，类似Python的dict
 */
public class MyMap1 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        //map.add();//不用这个，没有该方法
        map.put("itheima001","小智");
        map.put("itheima002","小美");
        map.put("itheima003","大胖");

        System.out.println(map);
    }
}
