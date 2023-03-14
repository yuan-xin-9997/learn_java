package com.yuanxin.druid;


import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.yuanxin.pojo.Account;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Druid数据库连接池演示 ConnectionPool
 */
public class DruidDemo {

    public static void main(String[] args) throws Exception {
        //1.导入jar包
        //2.定义配置文件

        //3. 加载配置文件
        Properties prop = new Properties();
        prop.load(new FileInputStream("jdbc/src/druid.properties"));
        System.out.println(prop);

        //4. 获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);

        //5. 获取数据库连接 Connection
        Connection conn = dataSource.getConnection();

        System.out.println(conn);

        // 获取当前路径
        System.out.println(System.getProperty("user.dir"));


        //3. 定义sql
        String sql = "select * from student";

        //4. 获取statement对象
        Statement stmt = conn.createStatement();

        //5. 执行sql
        ResultSet rs = stmt.executeQuery(sql);

        // 创建集合
        List<Account> list = new ArrayList<>();

        // 6.1 光标向下移动一行，并且判断当前行是否有数据
        while (rs.next()){
            Account account = new Account();

            //6.2 获取数据  getXxx()
            int id = rs.getInt("id");
            String name = rs.getString("name");
            double money = rs.getDouble("score");

            //赋值
            account.setId(id);
            account.setName(name);
            account.setScore(money);

            // 存入集合
            list.add(account);
        }

        System.out.println(list);
    }
}
