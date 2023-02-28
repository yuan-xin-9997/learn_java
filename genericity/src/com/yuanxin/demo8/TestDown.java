package com.yuanxin.demo8;

import java.util.ArrayList;
import java.util.List;

/**
 * 类型通配符下限
 */
public class TestDown {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        ArrayList<Cat> cats = new ArrayList<>();
        ArrayList<MiniCat> miniCats = new ArrayList<>();
        showAnimal(animals);
        showAnimal(cats);
        //showAnimal(miniCats);//报错
    }

    /**
     * 类型通配符下限，要求集合只能是Cat或Cat的父类类型
     * @param list
     */
    public static void showAnimal(List<? super Cat> list) {
        // 可以添加元素
        list.add(new Cat("g", 10));
        list.add(new MiniCat("a", 20, 1));
//        list.add(new Animal("g"))
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
