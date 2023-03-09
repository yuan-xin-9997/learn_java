package com.yuanxin.threaddemo7;

import java.util.concurrent.FutureTask;

public class Demo {
    public static void main(String[] args) {
        // 创建第一个线程
        //线程优先级: 1 - 10 默认值:5
        MyCallable mc = new MyCallable();
        FutureTask<String> ft = new FutureTask<>(mc); // 中间媒介，泛型和MyCallable中继续Runnable接口的泛型一直
        Thread t1 = new Thread(ft);  // 创建线程对象
        System.out.println(t1.getPriority());//5
        t1.setName("飞机");
        t1.setPriority(10);
        System.out.println(t1.getPriority());
        t1.start();

        // 创建第二个线程
        MyCallable mc2 = new MyCallable();
        FutureTask<String> ft2 = new FutureTask<>(mc2);
        Thread t2 = new Thread(ft2);
        System.out.println(t1.getPriority());//5
        t2.setName("坦克");
        t2.setPriority(1);
        System.out.println(t2.getPriority());//5
        t2.start();
    }
}
