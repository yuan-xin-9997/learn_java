package com.yuanxin.date;

import java.util.Date;

public class DateDemo1 {
    public static void main(String[] args) {
//        public Date()		创建一个Date对象，表示默认时间
//public Date(long date)	创建一个Date对象，表示指定时间

        //那么这个时间就表示电脑中的当前时间。
        Date date1 = new Date();
        System.out.println(date1);

        //从计算机的时间原点开始，过了指定毫秒的那个时间。
        Date date2 = new Date(0L);
        System.out.println(date2);//Thu Jan 01 08:00:00 CST 1970
        //从时间原点开始，过了0毫秒。
        //因为我们是在中国，我们是在东八区需要+8小时。

        //1970年1月1日 上午的9点
        Date date3 = new Date(3600L * 1000);
        System.out.println(date3);
    }
}
