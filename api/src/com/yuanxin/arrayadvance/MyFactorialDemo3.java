package com.yuanxin.arrayadvance;

public class MyFactorialDemo3 {
    public static void main(String[] args) {
        int result = getJc(5);
        System.out.println(result);
    }

    private static int getJc(int i) {
        //1,就是一定要找到出口.
        if(i == 1){
            return 1;
        }else{
            //2.就是递归的规则
            return i * getJc(i - 1);
       }
    }


}
