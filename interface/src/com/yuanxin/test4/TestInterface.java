package com.yuanxin.test4;

public class TestInterface {
    public static void main(String[] args) {
        InterAImpl ia = new InterAImpl();
        // ia.show();

        InterA.show();

        InterB.show();

        // InterAImpl.show();
    }
}

class InterAImpl implements InterA , InterB {

}
