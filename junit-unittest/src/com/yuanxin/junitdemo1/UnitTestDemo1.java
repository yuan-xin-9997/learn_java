package com.yuanxin.junitdemo1;
/*
使用junit进行java单元测试

Junit特点：
1. 是一个开放源代码的测试工具，第三方的
2. 提供注解来识别测试方法
3. 让你编写代码更快，并能提高质量
4. 优雅简洁，没那么复杂，花费时间较少
5. 在一个条中显示进度，如果运行良好，则是绿色，如果运行失败，则变成红色
 */

import org.junit.Test;

public class UnitTestDemo1 {
    public static void main(String[] args) {

    }

    // @Test表示测试下面的方法
    @Test
    public void add(){
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println(sum);
        System.out.println(2 / 0);
    }
}
