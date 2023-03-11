package com.yuanxin.socketdemo9_optimize_server.loopserver;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10002);

        // 增加while循环可以连续不断的接收客户端上传文件
        while (true) {
            Socket accept = ss.accept();

            //网络中的流,从客户端读取数据的
            BufferedInputStream bis = new BufferedInputStream(accept.getInputStream());

            //本地的IO流,把数据写到本地中,实现永久化存储
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:\\100-major-专业\\102-计算机科学软件、教程及文件\\009-java\\黑马java\\02 阶段二 javase进阶\\第三章 多线程 & 网络编程 & 基础\\3-6 服务器优化\\09-服务端优化-UUID(4369527) 副本.pcwlenv"));

            int b;
            while((b = bis.read()) !=-1){
                bos.write(b);
            }

            // 用字符流向网络传输数据
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
//        bw.write("上传成功");
//        bw.newLine();
//        bw.flush();

            // or 用字节流往网络中传输回应
            byte [] bytes = "上传成功".getBytes();
            OutputStream os = accept.getOutputStream();
            os.write(bytes);
            os.close();

            bos.close();
            accept.close();
        }
        // ss.close()


    }
}
