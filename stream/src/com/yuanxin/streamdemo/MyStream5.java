package com.yuanxin.streamdemo;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * Stream流的终结方法
 */
public class MyStream5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("张无忌");
        list.add("张翠山");
        list.add("王二麻子");
        list.add("张良");
        list.add("谢广坤");

        //method1(list);


//        long count​()：返回此流中的元素数
        long count = list.stream().count();
        System.out.println(count);


    }

    private static void method1(ArrayList<String> list) {
        //        void forEach​(Consumer action)：对此流的每个元素执行操作
//                      Consumer接口中的方法	void accept​(T t)：对给定的参数执行此操作
        //在forEach方法的底层,会循环获取到流中的每一个数据.
        //并循环调用accept方法,并把每一个数据传递给accept方法
        //s就依次表示了流中的每一个数据.
        //所以,我们只要在accept方法中,写上处理的业务逻辑就可以了.
        list.stream().forEach(
                new Consumer<String>() {
                    @Override
                    public void accept(String s) {
                        System.out.println(s);
                    }
                }
        );

        System.out.println("====================");

        //lambda表达式的简化格式
        //是因为Consumer接口中,只有一个accept方法
        list.stream().forEach(
                (String s)->{
                    System.out.println(s);
                }
        );
        System.out.println("====================");

        //lambda表达式还是可以进一步简化的.
        list.stream().forEach(s->System.out.println(s));
    }
}
