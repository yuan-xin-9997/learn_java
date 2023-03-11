package com.yuanxin.socketdemo2;


import java.io.IOException;
import java.net.*;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //1.找码头
        DatagramSocket ds = new DatagramSocket();// 空参数，随机绑定一个端口

        //2.打包礼物
        //数据包类对象  DatagramPacket(byte[] buf, int length, InetAddress address, int port)
        String s = "送给村长老丈人的礼物";
        byte[] bytes = s.getBytes();// 转换为字节数组
        InetAddress address = InetAddress.getByName("127.0.0.1");
        int port = 10000;
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);

        //3.由码头发送包裹
        ds.send(dp);

        //4.付钱走羊
        ds.close();
    }
}
