package exce;

public class ExceptionDemo5 {
    //定义一个猫类, 成员变量:姓名,年龄. 成员方法:睡觉,抓老鼠.
    //定义一个狗类, 成员变量:姓名,年龄. 成员方法:睡觉,看家.
    //定义一个饲养员类,成员方法:饲养动物,要求该方法既能养猫,又能养狗.
    //并在方法中调用猫狗的睡觉方法和特有方法.
    //在测试类中创建饲养员的对象,并调用饲养动物的方法.


    //分析:
        //1.本题涉及多少类?   猫  狗  饲养员  测试类
        //2.有没有共性内容可以抽取? 猫 和 狗 中有共性内容.
    public static void main(String[] args) {
        Feeder feeder = new Feeder();
        feeder.feedAnimal(new Cat());
    }
}
