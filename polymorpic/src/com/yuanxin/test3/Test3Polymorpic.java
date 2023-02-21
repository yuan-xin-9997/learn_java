package com.yuanxin.test3;

public class Test3Polymorpic {
    public static void main(String[] args) {
        useAnimal(new Dog());
        useAnimal(new Cat());
    }

    public static void useAnimal(Animal a){  // Animal a = new Dog();
                                             // Animal a = new Cat();
        a.eat();
        //a.watchHome();

        // 判断a变量记录的类型, 是否是Dog
        if(a instanceof Dog){
            Dog dog = (Dog) a;
            dog.watchHome();
        }

//        Dog dog = (Dog) a;
//        dog.watchHome();  // ClassCastException  类型转换异常

    }

}

abstract class Animal {
    public abstract void eat();
}

class Dog extends Animal {
    public void eat() {
        System.out.println("狗吃肉");
    }

    public void watchHome(){
        System.out.println("看家");
    }
}

class Cat extends Animal {
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
