package com.yuanxin.test7;

public class Test {
    public static void main(String[] args) {

        // Lambda调用
        /*useInter(() ->
                System.out.println("Lambda执行了")
        );*/

        useInter(new Inter() {
            @Override
            public void show() {
                System.out.println("匿名内部类的show方法");
            }
        });

    }

    public static void useInter(Inter i) {
        i.show();
    }
}

interface Inter {
    void show();
}
