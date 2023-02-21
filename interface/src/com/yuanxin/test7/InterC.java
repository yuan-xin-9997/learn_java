package com.yuanxin.test7;

public interface InterC extends InterA , InterB {
    @Override
    public default void method() {
        System.out.println("InterC接口,解决代码逻辑冲突问题, 重写method方法");
    }
}
