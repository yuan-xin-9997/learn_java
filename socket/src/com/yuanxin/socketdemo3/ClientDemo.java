package com.yuanxin.socketdemo3;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;
/*
单播UDP通信
* */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        DatagramSocket ds = new DatagramSocket();
        while (true) {
            String s = sc.nextLine();
            if("886".equals(s)){
                break;
            }
            byte[] bytes = s.getBytes();
            InetAddress address = InetAddress.getByName("127.0.0.1");
            int port = 10000;
            DatagramPacket dp = new DatagramPacket(bytes,bytes.length,address,port);

            ds.send(dp);
        }

        ds.close();
    }
}
