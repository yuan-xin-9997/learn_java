package com.yuanxin.threaddemo013;
/*
演示死锁 deadlock
 */
public class Demo {
    public static void main(String[] args) {
        Object objA = new Object();
        Object objB = new Object();

        new Thread(()->{
            // 使用lambda表达式创建线程
            while(true){
                synchronized (objA){
                    //线程一
                    synchronized (objB){
                        System.out.println("小康同学正在走路");
                    }
                }
            }
        }).start();

        new Thread(()->{
            while(true){
                synchronized (objB){
                    //线程二
                    synchronized (objA){
                        System.out.println("小薇同学正在走路");
                    }
                }
            }
        }).start();
    }
}
