package com.yuanxin.junitdemo1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/*
junit常用的三个注解
 */

public class UnitTestDemo2 {

    // 会在@Test注解的方法之前运行
    @Before
    public void before(){
        System.out.println("before");
    }

    @Test
    public void test(){
        System.out.println("test");
    }

    // 会在@Test注解的方法之后运行
    @After
    public void after(){
        System.out.println("after");
    }
}
