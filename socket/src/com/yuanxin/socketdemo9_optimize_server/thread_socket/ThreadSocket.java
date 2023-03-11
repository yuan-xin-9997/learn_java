package com.yuanxin.socketdemo9_optimize_server.thread_socket;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class ThreadSocket implements Runnable{

    private  Socket accept;

    public ThreadSocket(Socket accept){
        this.accept = accept;
    }

    @Override
    public void run() {
        BufferedOutputStream bos = null;
        try {

            //网络中的流,从客户端读取数据的
            BufferedInputStream bis = new BufferedInputStream(accept.getInputStream());

            //本地的IO流,把数据写到本地中,实现永久化存储
            // 使用UUID实现文件名不重复
            String file_name = "E:\\100-major-专业\\102-计算机科学软件、教程及文件\\009-java\\黑马java\\02 阶段二 javase进阶\\第三章 多线程 & 网络编程 & 基础\\3-6 服务器优化\\09-服务端优化-UUID(4369527) ";
            file_name = file_name + UUID.randomUUID().toString() + ".mp4";
            bos = new BufferedOutputStream(new FileOutputStream(file_name));

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


        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(bos != null){
                try {
                    bos.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if(accept!=null){
                try {
                    accept.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
