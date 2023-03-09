package com.yuanxin.threaddemo011;

public class Demo {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();  // 线程对象参数

        Thread t1 = new Thread(mr);  // 线程一
        Thread t2 = new Thread(mr);  // 线程二

        t1.setName("窗口一");
        t2.setName("窗口二");

        // 两个线程调用同一个run方法
        t1.start();
        t2.start();
    }
}
