package com.yuanxin.socketdemo9_optimize_server.thread_socket;

import java.io.*;
import java.net.Socket;
/*
实现文件服务器
 */

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",10003);

        //是本地的流,用来读取本地文件的.
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\100-major-专业\\102-计算机科学软件、教程及文件\\009-java\\黑马java\\02 阶段二 javase进阶\\第三章 多线程 & 网络编程 & 基础\\3-6 服务器优化\\09-服务端优化-UUID(4369527).pcwlenv"));

        //写到服务器 --- 网络中的流
        OutputStream os = socket.getOutputStream();
        BufferedOutputStream bos = new BufferedOutputStream(os);

        int b;
        while((b = bis.read())!=-1){
            bos.write(b);//通过网络写到服务器中
        }
        bos.flush();

        //给服务器一个结束标记,告诉服务器文件已经传输完毕
        socket.shutdownOutput();

        // 读取输入流，字符缓冲流
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line;
        while((line = br.readLine()) !=null){
            System.out.println(line);
        }
        bis.close();
        socket.close();


    }
}
