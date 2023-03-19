package com.itheima;

import com.itheima.dao.BookDao;
import com.itheima.dao.impl.BookDaoImpl;
import com.itheima.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForLifeCycle {
    public static void main( String[] args ) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

//        BookDaoImpl bookDao = (BookDaoImpl) ctx.getBean("bookDao");
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();

//        BookService bookService = (BookService) ctx.getBean("bookService");
//        bookService.save();

        //注册关闭钩子函数，在虚拟机退出之前回调此函数，关闭容器（推荐）
        //ctx.registerShutdownHook();

        //关闭容器，暴力的方法
        ctx.close();
    }
}
