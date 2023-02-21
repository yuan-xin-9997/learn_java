package com.yuanxin.test6;

public class TestInterface {
    public static void main(String[] args) {
        InterImpl ii = new InterImpl();
        ii.show();
        // 如果直接父类, 和接口中出现了相同的方法声明, 但是代码逻辑不一样
        // 优先使用直接父类的代码逻辑.
    }
}

class InterImpl extends Fu implements Inter {

}
