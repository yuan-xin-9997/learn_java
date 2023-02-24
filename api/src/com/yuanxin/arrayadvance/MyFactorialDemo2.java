package com.yuanxin.arrayadvance;

public class MyFactorialDemo2 {
    public static void main(String[] args) {
        int sum = getSum(100);
        System.out.println(sum);
    }

    private static int getSum(int i) {
        //1- 100之间的和
            //100 + (1-99之间的和)
                    // 99 + (1- 98之间的和)
                        //....
                            //1
        //方法的作用: 求 1- i 之间和
        if(i == 1){
            return 1;
        }else{
            return i + getSum(i -1);
        }
    }
}
