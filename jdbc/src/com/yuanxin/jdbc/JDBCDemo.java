package com.yuanxin.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * JDBC快速入门
 */
public class JDBCDemo {

    public static void main(String[] args) throws Exception {
        //1. 注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2. 获取连接
        com.yuanxin.connect_db.Connection connection = new com.yuanxin.connect_db.Connection();
//        String url = "jdbc:mysql://127.0.0.1:3306/db1";
        String url = "jdbc:mysql://" + connection.getHost() + ":" + connection.getPort() + "/" + connection.getDatabase() + "?useSSL=true";
        System.out.println(url);
        String username = connection.getUser();
        String password = connection.getPassword();
        Connection conn = DriverManager.getConnection(url, username, password);
        //3. 定义sql
        String sql = "select * from sch_yard_allocation_plan";
        //4. 获取执行sql的对象 Statement
        Statement stmt = conn.createStatement();
        //5. 执行sql
        ResultSet count = stmt.executeQuery(sql);//受影响的行数
        //6. 处理结果
        System.out.println(count);
        //7. 释放资源
        stmt.close();
        conn.close();
    }
}
