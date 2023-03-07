package com.yuanxin.propertiesio;

import java.util.Properties;
import java.util.Set;

public class PropertiesDemo2 {
    public static void main(String[] args) {
        //Object setProperty​(String key, String value) --- put
                    //设置集合的键和值，都是String类型，底层调用 Hashtable方法 put
        Properties prop = new Properties();
        prop.setProperty("江苏","南京");
        prop.setProperty("安徽","南京");
        prop.setProperty("山东","济南");

        System.out.println(prop);
        //String getProperty​(String key)  --- get
                    //使用此属性列表中指定的键搜索属性

       /* String value = prop.getProperty("江苏");
        System.out.println(value);*/


        //Set<String> stringPropertyNames​()  --- keySet
                    //从该属性列表中返回一个不可修改的键集，其中键及其对应的值是字符串

        Set<String> keys = prop.stringPropertyNames();
        for (String key : keys) {
            String value = prop.getProperty(key);
            System.out.println(key + "=" + value);
        }

    }
}
