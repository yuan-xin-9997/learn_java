package com.yuanxin.connect_db;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Connection {
    private String host;
    private String port;
    private String user;
    private String password;
    private String database;

    public Connection() throws DocumentException {
        //1.获取一个解析器对象
        SAXReader saxReader = new SAXReader();

        //2.利用解析器把xml文件加载到内存中,并返回一个文档对象
        Document document = saxReader.read(new File("E:\\IdeaProject\\learn_java\\dbresource.xml"));

        //3.获取到根标签
        Element rootElement = document.getRootElement();

        //4.通过根标签来获取Connection标签
        //elements():可以获取调用者所有的子标签(Connection和aaa).会把这些子标签放到一个集合中返回.
        //elements("标签名"):可以获取调用者所有的指定的子标签,会把这些子标签放到一个集合中并返回
        List<Element> listall = rootElement.elements();
        List<Element> ConnectionElements = rootElement.elements("connection");
//        System.out.println(listall.size());
//        System.out.println(ConnectionElements.size());

        //用来装学生对象
        Element element = ConnectionElements.get(0);
        //5.遍历集合,得到每一个Connection标签

        //获取name标签
        //element("标签名"):获取调用者指定的子标签
        Element hostElement = element.element("host");
        //获取这个标签的标签体内容
        String host = hostElement.getText();

        //获取age标签
        Element portElement = element.element("port");
        //获取age标签的标签体内容
        String port = portElement.getText();

        Element userElement = element.element("user");
        String user = userElement.getText();

        Element passwordElement = element.element("user");
        String password = passwordElement.getText();

        Element databaseElement = element.element("database");
        String database = databaseElement.getText();

//            System.out.println(id);
//            System.out.println(name);
//            System.out.println(age);

        this.host = host;
        this.port = port;
        this.user = user;
        this.password = password;
        this.database = database;
//        setHost(host);
    }


    public Connection(String host, String port, String user, String password, String database) {
        this.host = host;
        this.port = port;
        this.user = user;
        this.password = password;
        this.database = database;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    @Override
    public String toString() {
        return "Connection{" +
                "host='" + host + '\'' +
                ", port='" + port + '\'' +
                ", user='" + user + '\'' +
                ", password='" + password + '\'' +
                ", database='" + database + '\'' +
                '}';
    }
}

