package com.yuanxin.demo3;

import java.util.ArrayList;
import java.util.Random;

/**
 * 抽奖器
 * 注意：T、E、K、V 是常见的泛型标识，下面将泛型标识改为T一样可以
 * @param <E>
 */
public class ProductGetter<E> {
    static Random random = new Random();
    //奖品
    private E product;

    //奖品池
    ArrayList<E> list = new ArrayList<>();

    /**
     * 添加奖品
     * @param t 奖品
     */
    public void addProduct(E t) {
        list.add(t);
    }

    /**
     * 抽奖，泛型类的成员方法不可以变成静态方法
     * @return
     */
    public E getProduct() {
        E product = list.get(random.nextInt(list.size()));
        return product;
    }

    /**
     * 定义泛型方法，泛型方法中的泛型标识和泛型类中的泛型标识没有任何关系
     * @param list 参数
     * @param <E> 泛型标识，具体类型，由调用方法的时候来指定。
     * @return
     */
    public <E> E getProduct(ArrayList<E> list) {
        return list.get(random.nextInt(list.size()));
    }

    /**
     * 静态的泛型方法，采用多个泛型类型
     * @param t
     * @param e
     * @param k
     * @param <E>
     * @param <E>
     * @param <K>
     */
    public static <E,T,K> void printType(E t, T e, K k) {
        System.out.println(t + "\t" + t.getClass().getSimpleName());
        System.out.println(e + "\t" + e.getClass().getSimpleName());
        System.out.println(k + "\t" + k.getClass().getSimpleName());
    }

    /**
     * 泛型可变参数的定义，e作为参数，可以传递多个参数，类似Python args kargs
     * @param e
     * @param <E>
     */
    public static <E> void print(E... e){
        for (int i = 0; i < e.length; i++) {
            System.out.println(e[i]);
        }
    }

}
