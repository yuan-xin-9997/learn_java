package com.gui;

import javax.swing.*;

public class JButtonDemo01 {
    public static void main(String[] args) {
        JFrame jf = new JFrame();

        jf.setTitle("在窗口中添加按钮");
        jf.setSize(400, 300);
        jf.setDefaultCloseOperation(3);
        jf.setLocationRelativeTo(null);
        jf.setAlwaysOnTop(true);
        jf.setLayout(null);

        JButton jb = new JButton("我是按钮");
//        jb.setSize(100, 20);
//        jb.setLocation(100, 100);
        jb.setBounds(100, 100, 100, 20);

        JButton jb2 = new JButton("我是按钮2");
        jb2.setBounds(100, 120, 100, 20);

        jf.add(jb);
        jf.add(jb2);

        jf.setVisible(true);
    }
}
