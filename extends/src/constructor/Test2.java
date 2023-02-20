package constructor;

public class Test2 {
    public static void main(String[] args) {
        Zi z = new Zi();
    }
}

class Fu {
    int age;
    // 空参数构造方法
//    public Fu(){
//        System.out.println("父类空参数构造方法");
//    }
    // 带参数构造方法
    public Fu(int age){
        this.age = age;
    }
}

class Zi extends Fu {

    public Zi(){
        this(10); // super();
    }

    public Zi(int age){
        super(age);
    }
}
