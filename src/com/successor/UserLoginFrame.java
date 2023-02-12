package com.successor;


import javax.swing.*;

public class UserLoginFrame extends JFrame{

    public UserLoginFrame(){
        //窗体初始化
        initFrame();


        // 绘制窗体
        printView();

        this.setVisible(true);
    }

    public void printView() {
        //显示用户名文本
        JLabel usernameLable = new JLabel("用户名");
        usernameLable.setBounds(50, 50, 50, 20);
        this.add(usernameLable);

        //用户名输入框
        JTextField usernameField = new JTextField();
        usernameField.setBounds(150, 50, 180, 20);
        this.add(usernameField);

        //显示密码文本
        JLabel passwordLable = new JLabel("密码");
        passwordLable.setBounds(50, 100, 50, 20);
        this.add(passwordLable);

        //密码输入框
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(150, 100, 180, 20);
        this.add(passwordField);

        //登录按钮
        JButton loginButton = new JButton("登录");
        loginButton.setBounds(50, 200, 280, 20);
        this.add(loginButton);
    }

    public void initFrame() {
        this.setTitle("用户登录");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);
        this.setAlwaysOnTop(true);
        this.setLayout(null);
    }
}
