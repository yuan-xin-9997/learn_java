package com.gui;

import javax.swing.*;

public class JFrameDemo01 {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(400, 300);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(3);
        jf.setTitle("百度一下，你就知道");
        jf.setLocationRelativeTo(null);
        jf.setAlwaysOnTop(true);
    }
}
