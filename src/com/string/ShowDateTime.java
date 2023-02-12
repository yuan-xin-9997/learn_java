package com.string;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    手机日期和时间显示
 */
public class ShowDateTime {
    public static void main(String[] args) {
        //创建窗体对象
        JFrame jf = new JFrame();

        jf.setTitle("手机日期和时间显示");
        jf.setSize(400, 300);
        jf.setDefaultCloseOperation(3);
        jf.setLocationRelativeTo(null);
        jf.setAlwaysOnTop(true);
        jf.setLayout(null);

        //提示日期
        JLabel dateLable = new JLabel("日期");
        dateLable.setBounds(50, 50, 100, 20);
        jf.add(dateLable);

        Date d = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        String dateString = sdf.format(d);

        //按照格式显示日期的字符串
        JLabel showDateLable = new JLabel(dateString);
        showDateLable.setBounds(50, 80, 200, 20);
        jf.add(showDateLable);

        //提示时间
        JLabel timeLable = new JLabel("时间");
        timeLable.setBounds(50, 150, 100, 20);
        jf.add(timeLable);

        SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm");
        String timeString = sdf2.format(d);

        //按照格式显示时间的字符串
        JLabel showTimeLable = new JLabel(timeString);
        showTimeLable.setBounds(50, 180, 200, 20);
        jf.add(showTimeLable);

        jf.setVisible(true);
    }
}
