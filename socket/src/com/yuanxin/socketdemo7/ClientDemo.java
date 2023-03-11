package com.yuanxin.socketdemo7;

import java.io.*;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",10001);

        OutputStream os = socket.getOutputStream();
        os.write("hello".getBytes());
       // os.close();如果在这里关流,会导致整个socket都无法使用
        socket.shutdownOutput();  //仅仅关闭输出流.并写一个结束标记,对socket没有任何影响

        // 涉及到中文，不能使用单个字节的输入流
        /*InputStream is = socket.getInputStream();
        int b;
        while((b = is.read()) !=-1){
            System.out.println((char) b);
        }*/

        // 如果接收方判断对方可能发来中文字符，必须使用字符流来接收，由于Socket没有提供获取字符流的方法，所以必须使用转换流
//        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), Charset.forName("GBK")));
        // 其中socket.getInputStream()返回InputStream，是一个抽象类，字节流FileInputStream是该抽象类的一个实现
        // InputStreamReader是转换流，是字节流到字符流的桥梁
        // BufferedReader 是字符缓冲流
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
        String line;
        while((line = br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
        os.close();
        socket.close();
    }
}
