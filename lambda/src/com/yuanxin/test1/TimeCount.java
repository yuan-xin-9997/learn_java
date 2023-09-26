package com.yuanxin.test1;

public class TimeCount {

    public static void main(String[] args) {
        for (int i = 0; i < 1000000; i++) {
            System.out.println(i);
        }
        // 使用匿名函数实现Python装饰器对代码进行计时
        time_this(() -> {
            // code to be timed
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

    }

    public static void time_this(Runnable func) {
        long start = System.nanoTime();
        func.run();
        long end = System.nanoTime();
        System.out.println("函数运行时间: " + (end - start) / 1e9 + " 秒");
    }
}