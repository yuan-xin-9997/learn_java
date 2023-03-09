package com.yuanxin.threaddemo3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Demo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //线程开启之后需要执行里面的call方法
        MyCallable mc = new MyCallable();

        //Thread t1 = new Thread(mc);

        //可以获取线程执行完毕之后的结果.也可以作为参数传递给Thread对象
        FutureTask<String> ft = new FutureTask<>(mc);

        //创建线程对象
        Thread t1 = new Thread(ft);

        // 不可以将获取线程执行结果函数放在start之前，否则会锁死
//        String s = ft.get();

        //开启线程
        t1.start();

        // 获取线程执行结果
        String s = ft.get();
        System.out.println(s);
    }
}
