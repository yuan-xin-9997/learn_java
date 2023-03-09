package com.yuanxin.threaddemo9;

public class Ticket implements Runnable {
    //票的数量
    private int ticket = 100;
    private Object obj = new Object();

    @Override
    public void run() {
        while(true){
            // 锁多条语句操作共享数据，可以使用同步代码块实现
            synchronized (obj){//多个线程必须使用同一把锁.   obj是锁对象 obj任意对象，可以是任何Object，所有线程必须是同一把锁
                if(ticket <= 0){
                    //卖完了
                    break;
                }else{
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ticket--;
                    System.out.println(Thread.currentThread().getName() + "在卖票,还剩下" + ticket + "张票");
                }
            }
        }
    }
}
