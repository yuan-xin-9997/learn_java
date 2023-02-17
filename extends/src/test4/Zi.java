package test4;

public class Zi extends Fu{
    int a = 20;
    public void method(){
        int a = 30;

        System.out.println(a);//30
        // 需求1：在控制台打印本类成员变量 20
        System.out.println(this.a);
        // 需求2：在控制台打印父类成员便令 10
        System.out.println(super.a);
    }
}
