package com.itheima;

import com.itheima.service.BookService;
import com.itheima.service.impl.BookServiceImpl;

public class App {
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));

        BookService bookService = new BookServiceImpl();
        bookService.save();
    }
}
