package com.yuanxin.logdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class LogDemo {

    //获取日志对象
//    private static final Logger LOGGER = LoggerFactory.getLogger(LogDemo.class);
    private static final Logger LOGGER= LoggerFactory.getLogger(LogDemo.class);

    public static void main(String[] args) {
        //打日志 --- 类似于写输出语句

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的姓名");
        LOGGER.debug("用户开始输入信息了");
        String name = sc.nextLine();
        //System.out.println(name);
        LOGGER.info("用户输出录入姓名为:" + name);
        System.out.println("请输入您的年龄");
        String age = sc.nextLine();
        try {
            int ageInt = Integer.parseInt(age);
            LOGGER.info("用户输入的年龄格式正确" + age);
        } catch (NumberFormatException e) {
            LOGGER.info("用户输入的年龄格式错误" + age);
        }
    }
}
