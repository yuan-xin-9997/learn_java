package com.yuanxin.socketdemo9_optimize_server.thread_socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10003);

        // while true循环无法使多个文件同时上传，可以使用多线程同时接收文件上传

        // 增加while循环可以连续不断的接收客户端上传文件
        while (true) {
            Socket accept = ss.accept();
            ThreadSocket ts = new ThreadSocket(accept);
            new Thread(ts).start();
        }
        // ss.close()


    }
}
