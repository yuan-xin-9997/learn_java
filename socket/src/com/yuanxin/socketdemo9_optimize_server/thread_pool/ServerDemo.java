package com.yuanxin.socketdemo9_optimize_server.thread_pool;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10003);

        // 优化3：使用线程池共享线程资源
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,  // 核心线程数量
                10,  //线程池中最大线程的数量
                60,// 空闲时间（值）
                TimeUnit.SECONDS,// 空闲时间（单位）
                new ArrayBlockingQueue<>(5),// 阻塞队列
                Executors.defaultThreadFactory(),// 创建线程的方式
                new ThreadPoolExecutor.AbortPolicy()//要执行的任务过多时的解决方案
        );


        // 优化2：while true循环无法使用多个文件同时上传，可以使用多线程同时接收文件上传
        // 优化1：增加while循环可以连续不断的接收客户端上传文件
        while (true) {
            Socket accept = ss.accept();
            ThreadSocket ts = new ThreadSocket(accept);
//            new Thread(ts).start();
            pool.submit(ts);
        }
        // ss.close()


    }
}
