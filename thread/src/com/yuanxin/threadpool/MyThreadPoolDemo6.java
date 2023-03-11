package com.yuanxin.threadpool;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MyThreadPoolDemo6 {
    //    参数一：核心线程数量
//    参数二：最大线程数
//    参数三：空闲线程最大存活时间
//    参数四：时间单位  --- TimeUnit
//    参数五：任务队列 --- 让任务在队列中等着，等有线程空闲了，再从这个队列中获取任务并执行
//    参数六：创建线程工厂 --- 按照默认的方式创建线程对象
//    参数七：任务的拒绝策略 --- （1）什么时候拒绝任务？当提交任务数量>最大线程数量+任务队列容量（2）如何拒绝？
    public static void main(String[] args) {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                1,
                2,
                2,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(1),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.DiscardOldestPolicy()//抛弃队列中等待最久的任务 然后把当前任务加入队列中。

        );

        for (int i = 0; i < 10; i ++) {
            int y = i;
            pool.submit(()->{
                System.out.println(Thread.currentThread().getName() + "---" + y);
            });
        }


        pool.shutdown();
    }
}

