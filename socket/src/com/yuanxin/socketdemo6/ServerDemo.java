package com.yuanxin.socketdemo6;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    // TCP 接收端
    public static void main(String[] args) throws IOException {

        //1. 创建Socket对象
        ServerSocket ss = new ServerSocket(10001);

        //2. 等待客户端连接
        System.out.println(111);
        Socket accept = ss.accept();
        System.out.println(222);

        //3.获得输入流对象
        InputStream is = accept.getInputStream();
        int b;
        while((b = is.read()) != -1){
            System.out.print((char) b);
        }
        System.out.println();
        System.out.println("看看我执行了吗?");

        //4.释放资源
        is.close();
        ss.close();
    }
}
