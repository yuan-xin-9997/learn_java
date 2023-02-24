package com.yuanxin.bigdecimal;

import java.math.BigDecimal;

public class MyBigDecimalDemo3 {
    //如果想要进行精确运算,那么请使用字符串的构造
    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal(0.1);
        BigDecimal bd2 = new BigDecimal(0.2);
        BigDecimal bd3 = new BigDecimal("0.1");
        BigDecimal bd4 = new BigDecimal("0.2");
//        public BigDecimal add(另一个BigDecimal对象) 	加法
        BigDecimal add = bd1.add(bd2);
        System.out.println("和为" + add);
        BigDecimal add2 = bd3.add(bd4);
        System.out.println("和为" + add2);
        System.out.println(0.1 + 0.2);


//        public BigDecimal subtract (另一个BigDecimal对象)  减法
        BigDecimal subtract = bd3.subtract(bd4);
        System.out.println("差为" + subtract);

//        public BigDecimal multiply (另一个BigDecimal对象)  乘法
        BigDecimal multiply = bd3.multiply(bd4);
        System.out.println("积为" + multiply);

//        public BigDecimal divide (另一个BigDecimal对象)    除法
        BigDecimal divide = bd3.divide(bd4);
        System.out.println("商为"+divide);

    }
}
