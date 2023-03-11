package com.yuanxin.socketdemo5;

import java.io.IOException;
import java.net.*;

public class ClientDemo {
    // 广播发送端
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();

        String s = "广播 hello";
        byte[] bytes = s.getBytes();
        InetAddress address = InetAddress.getByName("255.255.255.255");// 广播地址
        int port = 10000;
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length,address,port);

        ds.send(dp);

        ds.close();
    }
}
