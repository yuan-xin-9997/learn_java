package com.yuanxin.threaddemo9;
/*
需求：某电影院目前正在上映国产大片，共有100张票，而它有3个窗口卖票，请设计一个程序模拟该电影院卖票


思路：
定义一个类Ticket实现Runnable接口，里面定义一个成员变量：private int ticketCount = 100;
在Ticket类中重写run()方法实现卖票，代码步骤如下
A：判断票数大于0，就卖票，并告知是哪个窗口卖的
B：票数要减1
C：卖光之后，线程停止
定义一个测试类TicketDemo，里面有main方法，代码步骤如下
A：创建Ticket类的对象
B：创建三个Thread类的对象，把Ticket对象作为构造方法的参数，并给出对应的窗口名称
C：启动线程

 */
public class Demo {
    public static void main(String[] args) {
        // 下面方式是错的，相当于三个线程都有各自的100张票
        /*Ticket ticket1 = new Ticket();
        Ticket ticket2 = new Ticket();
        Ticket ticket3 = new Ticket();

        Thread t1 = new Thread(ticket1);
        Thread t2 = new Thread(ticket2);
        Thread t3 = new Thread(ticket3);*/

        Ticket ticket = new Ticket();

        Thread t1 = new Thread(ticket);
        Thread t2 = new Thread(ticket);
        Thread t3 = new Thread(ticket);

        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");

        t1.start();
        t2.start();
        t3.start();
    }
}
