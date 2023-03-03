package com.yuanxin.variableparameter;

/**
 * 需求：定义一个方法求N个数的和
 * 可变参数实现
 *
 * 可变参数：就是形参的个数是可以变化的
 * 格式：修饰符 返回值类型 方法名(数据类型… 变量名) {  }
 * 范例：public static int sum(int… a) {  }
 *
 * 可变参数注意事项
 * 这里的变量其实是一个数组
 * 如果一个方法有多个参数，包含可变参数，可变参数要放在最后
 */
public class MyVariableParameter3 {
    public static void main(String[] args) {
//        int [] arr = {1,2,3,4,5};
//        System.out.println(arr);
        int sum1 = getSum(1, 2, 3, 4, 5);
        System.out.println(sum1);
    }

    // 可变参数，...固定写法
    public static int getSum(int number, int... arr) {
        //System.out.println(arr);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}
