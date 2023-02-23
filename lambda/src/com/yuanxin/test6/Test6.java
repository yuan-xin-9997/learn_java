package com.yuanxin.test6;

public class Test6 {
    public static void main(String[] args) {
        /*useInter( (double a, double b) -> {
            return a + b;
        });*/

        useInter((a, b) ->
                a + b
        );
    }

    public static void useInter(Inter i) {
        double result = i.method(12.3, 22.3);
        System.out.println(result);
    }

}

interface Inter {
    // 用于计算 a + b 的结果并返回
    double method(double a, double b);
}
