package exce;

public class Cat extends Animal {
    //因为构造方法不能被继承只能被子类使用super关键字去调用
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
