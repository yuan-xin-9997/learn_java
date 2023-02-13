package com.successor.picture_pizzle;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class PictureFrame extends JFrame {
    //定义二维数组，存储图片编号
    int[][] datas = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };

    //定义成功数组
    int[][] winDatas = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };

    //纪录0号图片索引
    int x0;
    int y0;

    //定义按钮
    JButton shangButton;
    JButton zuoButton;
    JButton xiaButton;
    JButton youButton;
    JButton qiuzhuButton;
    JButton chongzhiButton;

    JPanel imagePanel;

    //无参构造方法
    public PictureFrame() {
        //窗体的基本设置
        initFrame();
        //二维数组元素打乱
        initData();
        //窗体上组件的绘制
        paintView();
        //给按钮注册事件
        addButtonEvent();
        //设置窗体可见
        this.setVisible(true);
    }

    //判断二维数组中的元素是否相同
    public boolean isSuccess() {
        for (int i = 0; i < datas.length; i++) {
            for (int j = 0; j < datas[i].length; j++) {
                if(datas[i][j] != winDatas[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    //移动成功之后的操作
    public void success() {
        datas = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        shangButton.setEnabled(false);
        zuoButton.setEnabled(false);
        xiaButton.setEnabled(false);
        youButton.setEnabled(false);
    }

    //重新绘制图形
    public void rePaintView() {
        //移除容器上的组件
        imagePanel.removeAll();

        imagePanel = new JPanel();
        imagePanel.setBounds(150, 114, 360, 360);
        imagePanel.setLayout(null);

        for (int i = 0; i < datas.length; i++) {
            for (int j = 0; j < datas[i].length; j++) {
                JLabel imageLabel = new JLabel(new ImageIcon("E:\\IdeaProject\\learn_java\\images\\" + datas[i][j] + ".png"));
                imageLabel.setBounds(j * 90, i * 90, 90, 90);
                imagePanel.add(imageLabel);
            }
        }
        this.add(imagePanel);

        //重新绘制
        imagePanel.repaint();
    }

    //给按钮注册事件
    public void addButtonEvent() {
        shangButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                System.out.println("上");
                //边界处理
                if (x0 == 3) {
                    return;
                }

                //元素交换
                datas[x0][y0] = datas[x0 + 1][y0];
                datas[x0 + 1][y0] = 0;
                x0 = x0 + 1;

                //判断移动是否成功
                if(isSuccess()) {
                    success();
                }

                //重新绘制图形
                rePaintView();
            }
        });
        zuoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //边界处理
                if (y0 == 3) {
                    return;
                }

                //元素交换
                datas[x0][y0] = datas[x0][y0 + 1];
                datas[x0][y0 + 1] = 0;
                y0 = y0 + 1;

                //判断移动是否成功
                if(isSuccess()) {
                    success();
                }

                //重新绘制图形
                rePaintView();
            }
        });
        xiaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //边界处理
                if (x0 == 0) {
                    return;
                }

                //元素交换
                datas[x0][y0] = datas[x0 - 1][y0];
                datas[x0 - 1][y0] = 0;
                x0 = x0 - 1;

                //判断移动是否成功
                if(isSuccess()) {
                    success();
                }

                //重新绘制图形
                rePaintView();
            }
        });
        youButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //边界处理
                if (y0 == 0) {
                    return;
                }

                //元素交换
                datas[x0][y0] = datas[x0][y0 - 1];
                datas[x0][y0 - 1] = 0;
                y0 = y0 - 1;

                //判断移动是否成功
                if(isSuccess()) {
                    success();
                }

                //重新绘制图形
                rePaintView();
            }
        });
        qiuzhuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                success();
                rePaintView();
            }
        });
        chongzhiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                datas = new int[][]{
                        {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,0}
                };
                initData();
                rePaintView();
                shangButton.setEnabled(true);
                zuoButton.setEnabled(true);
                xiaButton.setEnabled(true);
                youButton.setEnabled(true);
            }
        });
    }

    //二维数组元素打乱
    public void initData() {
        Random r = new Random();
//       打乱图片顺序
        for (int i = 0; i < datas.length; i++) {
            for (int j = 0; j < datas[i].length; j++) {
                int x = r.nextInt(datas.length);
                int y = r.nextInt(datas[x].length);

                int temp = datas[i][j];
                datas[i][j] = datas[x][y];
                datas[x][y] = temp;
            }
        }

        // 记录0号图片的索引
        wc:
        for (int i = 0; i < datas.length; i++) {
            for (int j = 0; j < datas[i].length; j++) {
                if (datas[i][j] == 0) {
                    x0 = i;
                    y0 = j;
                    break wc;
                }
            }
        }

//        System.out.println(x0 + "," + y0);
    }

    //窗体上组件的绘制
    public void paintView() {
        //标题图片
        JLabel titleLabel = new JLabel(new ImageIcon("E:\\IdeaProject\\learn_java\\images\\title.png"));
        titleLabel.setBounds(354, 27, 232, 57);
        this.add(titleLabel);

        imagePanel = new JPanel();
        imagePanel.setBounds(150, 114, 360, 360);
        imagePanel.setLayout(null);

        for (int i = 0; i < datas.length; i++) {
            for (int j = 0; j < datas[i].length; j++) {
                JLabel imageLabel = new JLabel(new ImageIcon("E:\\IdeaProject\\learn_java\\images\\" + datas[i][j] + ".png"));
                imageLabel.setBounds(j * 90, i * 90, 90, 90);
                imagePanel.add(imageLabel);
            }
        }
        this.add(imagePanel);

        //参照图
        JLabel canzhaotuLabel = new JLabel(new ImageIcon("E:\\IdeaProject\\learn_java\\images\\canzhaotu.png"));
        canzhaotuLabel.setBounds(574, 114, 122, 121);
        this.add(canzhaotuLabel);

        //上下左右按钮
        shangButton = new JButton(new ImageIcon("E:\\IdeaProject\\learn_java\\images\\shang.png"));
        shangButton.setBounds(732, 265, 57, 57);
        this.add(shangButton);

        zuoButton = new JButton(new ImageIcon("E:\\IdeaProject\\learn_java\\images\\zuo.png"));
        zuoButton.setBounds(650, 347, 57, 57);
        this.add(zuoButton);

        xiaButton = new JButton(new ImageIcon("E:\\IdeaProject\\learn_java\\images\\xia.png"));
        xiaButton.setBounds(732, 347, 57, 57);
        this.add(xiaButton);

        youButton = new JButton(new ImageIcon("E:\\IdeaProject\\learn_java\\images\\you.png"));
        youButton.setBounds(813, 347, 57, 57);
        this.add(youButton);

        //求助和重置按钮
        qiuzhuButton = new JButton(new ImageIcon("E:\\IdeaProject\\learn_java\\images\\qiuzhu.png"));
        qiuzhuButton.setBounds(626, 444, 108, 45);
        this.add(qiuzhuButton);

        chongzhiButton = new JButton(new ImageIcon("E:\\IdeaProject\\learn_java\\images\\chongzhi.png"));
        chongzhiButton.setBounds(786, 444, 108, 45);
        this.add(chongzhiButton);

        //背景图
        JLabel backgroundLabel = new JLabel(new ImageIcon("E:\\IdeaProject\\learn_java\\images\\background.png"));
        backgroundLabel.setBounds(0, 0, 960, 530);
        this.add(backgroundLabel);
    }

    //窗体的基本设置
    public void initFrame() {
        this.setSize(960, 565);
        this.setTitle("动漫拼图");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
        this.setAlwaysOnTop(true);
        this.setLayout(null);
    }
}
