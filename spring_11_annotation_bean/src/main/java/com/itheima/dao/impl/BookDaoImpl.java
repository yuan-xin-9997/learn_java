package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
//@Component定义bean
//@Component("bookDao")
//@Repository：@Component衍生注解，功能和@Component一样，只是便于区分
@Repository("bookDao")
public class BookDaoImpl implements BookDao {
    public void save() {
        System.out.println("book dao save ...");
    }
}
