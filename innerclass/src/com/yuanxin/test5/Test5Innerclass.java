package com.yuanxin.test5;

public class Test5Innerclass {
    /*
        1. 创建实现类, 通过implements关键字去实现接口
        2. 重写方法
        3. 创建实现类对象
        4. 调用重写后的方法.

        匿名内部类:

            前提: 需要存在类\接口
            格式:
                    new 类名 \ 接口名 (){
                        重写方法
                    }
     */
    public static void main(String[] args) {
        InterImpl ii = new InterImpl();
        ii.show();

        // 匿名内部类的理解: 将继承\实现, 方法重写, 创建对象, 放在了一步进行.
        // 解释: 实现了Inter接口的, 一个实现类对象.
        new Inter() {
            @Override
            public void show() {
                System.out.println("我是匿名内部类中的show方法");
            }
        }.show();

        // 情况: 接口中存在多个方法
        Inter2 i = new Inter2() {
            @Override
            public void show1() {
                System.out.println("show1...");
            }

            @Override
            public void show2() {
                System.out.println("show2...");
            }
        };

        i.show1();
        i.show2();
    }
}

interface Inter {
    void show();
}

interface Inter2 {
    void show1();
    void show2();
}

class InterImpl implements Inter {

    @Override
    public void show() {
        System.out.println("InterImpl  重写的show方法");
    }
}
