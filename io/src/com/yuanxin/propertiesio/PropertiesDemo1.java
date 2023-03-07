package com.yuanxin.propertiesio;


import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo1 {
    public static void main(String[] args) {
        Properties prop = new Properties();
        //增
        prop.put("小龙女","尹志平");
        prop.put("郭襄","杨过");
        prop.put("黄蓉","欧阳克");
        System.out.println(prop);

        //删
        prop.remove("郭襄");
        System.out.println(prop);

        //改
        //put --- 如果键不存在,那么就添加,如果键存在,那么就覆盖.
        prop.put("小龙女","杨过");
        System.out.println(prop);

        //查
        Object value1 = prop.get("黄蓉");
        System.out.println(value1);
        System.out.println("========================");

        //遍历
        // 方式一
        Set<Object> keys = prop.keySet();
        for (Object key : keys) {
            Object value = prop.get(key);
            System.out.println(key + "=" + value);
        }
        System.out.println("========================");

        //方式二， 装的是所有的键值对对象.
        Set<Map.Entry<Object, Object>> entries = prop.entrySet();
        for (Map.Entry<Object, Object> entry : entries) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key + "=" + value);
        }

    }
}
