package com.gui;

import javax.swing.*;

public class UserLogin {
    public static void main(String[] args) {
        JFrame jf = new JFrame();

        jf.setTitle("用户登录");
        jf.setSize(400, 300);
        jf.setDefaultCloseOperation(3);
        jf.setLocationRelativeTo(null);
        jf.setAlwaysOnTop(true);
        jf.setLayout(null); //取消窗体的默认布局，放置在中间

        // 显示用户名文本
        JLabel usernameLabel = new JLabel("用户名");
        usernameLabel.setBounds(50, 50, 50, 20);
        jf.add(usernameLabel);

        // 用户名输入框
        JTextField usernameField = new JTextField();
        usernameField.setBounds(150, 50, 180, 20);
        jf.add(usernameField);

        // 显示用户名文本
        JLabel userpasswordLabel = new JLabel("用户名");
        userpasswordLabel.setBounds(50, 100, 50, 20);
        jf.add(userpasswordLabel);

        // 用户名输入框
//        JTextField userpasswordField = new JTextField();
//        userpasswordField.setBounds(150, 100, 180, 20);
//        jf.add(userpasswordField);

        JPasswordField userpasswordField = new JPasswordField();
        userpasswordField.setBounds(150, 100, 180, 20);
        jf.add(userpasswordField);

        // 登录按钮
        JButton loginButton = new JButton("登录");
        loginButton.setBounds(50, 200, 280, 20);
        jf.add(loginButton);

        jf.setVisible(true);
    }
}
