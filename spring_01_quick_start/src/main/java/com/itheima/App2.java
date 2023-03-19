package com.itheima;

import com.itheima.dao.BookDao;
import com.itheima.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));

        //3.获取IoC容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        //4.获取bean（根据bean配置id获取）
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();

        System.out.println("--------------------------");

        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.save();

    }
}
