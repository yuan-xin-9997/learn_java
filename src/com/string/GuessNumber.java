package com.string;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/*
    1:系统产生一个1-100之间的随机数
    2:猜的内容不能为空
    3:每次根据猜的数字给出相应的提示
*/
public class GuessNumber {
    public static void main(String[] args) {
        //创建窗体对象
        JFrame jf = new JFrame();

        jf.setTitle("猜数字");
        jf.setSize(400, 300);
        jf.setDefaultCloseOperation(3);
        jf.setLocationRelativeTo(null);
        jf.setAlwaysOnTop(true);
        jf.setLayout(null);

        //系统产生一个1-100之间的随机数
        Random r = new Random();
        int number = r.nextInt(100) + 1;

        //提示信息
        JLabel messageLable = new JLabel("系统产生了一个1-100之间的数据，请猜一猜");
        messageLable.setBounds(70, 50, 350, 20);
        jf.add(messageLable);

        //输入要猜的数字
        JTextField numberField = new JTextField();
        numberField.setBounds(120, 100, 150, 20);
        jf.add(numberField);

        //猜数字的按钮
        JButton guessButton = new JButton("我猜");
        guessButton.setBounds(150, 150, 100, 20);
        jf.add(guessButton);

        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String stringNumber = numberField.getText().trim();
                if (stringNumber.equals("")){
                    JOptionPane.showMessageDialog(jf, "猜的数字不能喂空");
                    return;
                }

                int guessNumber = Integer.parseInt(stringNumber);
                if (guessNumber>number){
                    JOptionPane.showMessageDialog(jf, "你猜的数字大了");
                    numberField.setText("");
                }else if (guessNumber<number){
                    JOptionPane.showMessageDialog(jf, "你猜的数字小了");
                    numberField.setText("");
                }else{
                    JOptionPane.showMessageDialog(jf, "猜中了");
                }
            }
        });

        jf.setVisible(true);
    }
}
