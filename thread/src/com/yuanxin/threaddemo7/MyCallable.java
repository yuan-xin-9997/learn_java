package com.yuanxin.threaddemo7;

import java.util.concurrent.Callable;

// Callable的泛型是线程执行之后返回结果的类型
public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "---" + i);
        }
        return "线程执行完毕了";
    }
}
