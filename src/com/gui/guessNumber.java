package com.gui;

import javax.swing.*;

public class guessNumber {
    public static void main(String[] args) {
        // 窗体
        JFrame jf = new JFrame();

        jf.setTitle("猜数字");
        jf.setSize(400, 300);
        jf.setDefaultCloseOperation(3);
        jf.setLocationRelativeTo(null);
        jf.setAlwaysOnTop(true);
        jf.setLayout(null); //取消窗体的默认布局，放置在中间

        // 提示信息
        JLabel messageLabel = new JLabel("系统产生了一个1-100之间的数据，请猜一猜");
        messageLabel.setBounds(70, 50, 350, 20);
        jf.add(messageLabel);

        // 输入要猜的数字
        JTextField numberField = new JTextField();
        numberField.setBounds(120, 100, 150, 20);
        jf.add(numberField);

        // 猜数字的按钮
        JButton guessButton = new JButton("我猜测");
        guessButton.setBounds(150, 150, 100, 20);
        jf.add(guessButton);

        jf.setVisible(true);

    }
}
