package com.yuanxin.threadpool;


//static ExecutorService newCachedThreadPool()   创建一个默认的线程池
//static newFixedThreadPool(int nThreads)	    创建一个指定最多线程数量的线程池

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThreadPoolDemo {
    public static void main(String[] args) throws InterruptedException {

        //1,创建一个默认的线程池对象.池子中默认是空的.默认最多可以容纳int类型的最大值.
        ExecutorService executorService = Executors.newCachedThreadPool();
        //Executors --- 可以帮助我们创建线程池对象
        //ExecutorService --- 可以帮助我们控制线程池

        // 使用lambda表达式创建任务
        // submit 的入参是Runnable接口，该接口只有一个run方法，所以可以使用lambda表达式快速创建接口的实现类对象
        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName() + "在执行了");
        });

        // 下面这条语句，让两个任务都由线程池中的同一个线程执行了，因为在sleep期间，任务一已经执行完了，并且将线程还给线程池了
        Thread.sleep(2000);

        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName() + "在执行了");
        });

        executorService.shutdown();
    }
}
