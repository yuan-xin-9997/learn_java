package com.yuanxin.test2;

public class Test2Polymorpic {
    /*
         多态的成员访问特点:

                成员变量: 编译看左边 (父类), 运行看左边 (父类)

                成员方法: 编译看左边 (父类), 运行看右边 (子类)
     */
    public static void main(String[] args) {
        Fu f = new Zi();
        System.out.println(f.num);
        f.method();
    }
}

class Fu {
    int num = 10;

    public void method(){
        System.out.println("Fu.. method");
    }
}

class Zi extends Fu {
    int num = 20;

    public void method(){
        System.out.println("Zi.. method");
    }
}


/*
interface Fu {
    int num = 10;

    public default void method(){
        System.out.println("Fu.. method");
    }
}

class Zi implements Fu {
    int num = 20;
    @Override
    public void method(){
        System.out.println("Zi.. method");
    }
}
 */

