package com.yuanxin.test2;

public class Test2Innerclass {
    /*
        私有成员内部类演示
     */
    public static void main(String[] args) {
        // Outer.Inner oi = new Outer().new Inner();

        Outer o = new Outer();
        o.method();
    }
}

class Outer {
    private class Inner {
        public void show(){
            System.out.println("inner..show");
        }
    }

    public void method(){
        Inner i = new Inner();
        i.show();
    }
}