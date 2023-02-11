package com.gui;

import javax.swing.*;

public class JLabelDemo01 {
    public static void main(String[] args) {
        JFrame jf = new JFrame();

        jf.setTitle("窗口中添加按钮");
        jf.setSize(400, 300);
        jf.setDefaultCloseOperation(3);
        jf.setLocationRelativeTo(null);
        jf.setAlwaysOnTop(true);
        jf.setLayout(null); //取消窗体的默认布局

        //JButton(String text)：创建一个带文本的按钮
        JButton btn = new JButton("我是按钮");
//        //void setSize(int width, int height)：设置大小
//        btn.setSize(100,20);
//        //void setLocation(int x, int y)：设置位置(x坐标，y坐标)
////        btn.setLocation(0,0);
//        btn.setLocation(100,100);
        btn.setBounds(100,100,100,20);

        JButton btn2 = new JButton("我是按钮2");
        btn2.setBounds(100,120,100,20);

        jf.add(btn);
        jf.add(btn2);

        JLabel jl = new JLabel("好好学习");
        jl.setBounds(0, 0, 100, 20);
        jf.add(jl);

        ImageIcon imageIcon = new ImageIcon("images/mn.png");
//        ImageIcon imageIcon = new ImageIcon("E:\\IdeaProject\\learn_java\\images\\mn.png");
        JLabel jl2 = new JLabel(imageIcon);
        jl2.setBounds(50, 50, 100, 143);
        jf.add(jl2);

        //设置窗体可见
        jf.setVisible(true);
    }
}
