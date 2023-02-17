package test5;

public class Zi extends Fu {
    public void show(){
        System.out.println("子类show方法");
    }

    public void method(){
        this.show();
        super.show();
    }
}
