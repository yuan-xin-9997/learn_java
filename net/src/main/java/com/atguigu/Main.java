package com.atguigu;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) {
        try {
      InetAddress inetadd = InetAddress.getLocalHost();
      String name = inetadd.getHostName();
      String address = inetadd.getHostAddress();
      System.out.println("HostName is : " + name);
      System.out.println("Host Address is: " + address);
    } catch (UnknownHostException u) {
    }
  }

}