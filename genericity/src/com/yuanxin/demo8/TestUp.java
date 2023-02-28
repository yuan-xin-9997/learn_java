package com.yuanxin.demo8;

import java.util.ArrayList;

/**
 * 泛型通配符上限
 */
public class TestUp {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        ArrayList<Cat> cats = new ArrayList<>();
        ArrayList<MiniCat> miniCats = new ArrayList<>();

        cats.addAll(cats);
        cats.addAll(miniCats);
        //showAnimal(animals);// 报错，类型通配符上限限定了为Cat
        showAnimal(cats);
        showAnimal(miniCats);

        System.out.println("--------------------------------------------");

    }

    /**
     * 泛型上限通配符，传递的集合类型，只能是Cat或Cat的子类类型。
     * @param list
     */
    public static void showAnimal(ArrayList<? extends Cat> list) {
        // 类型通配符上限，不能使用add方法，因为不能确定原来的ArrayList是什么类型的元素
        //list.add(new Animal());
        //list.add(new Cat());
        //list.add(new MiniCat());
        for (int i = 0; i < list.size(); i++) {
            Cat cat = list.get(i);
            System.out.println(cat);
        }
    }

}
