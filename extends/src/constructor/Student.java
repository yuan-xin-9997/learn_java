package constructor;

/*
    思路1: 子类在初始化之前, 一定要先完成父类数据的初始化.
    思路2: 子类在初始化之前, 一定要先访问到父类的构造方法, 完成父类数据的初始化
    结论: 系统在每一个构造方法中, 默认隐藏的一句代码 super();
 */
public class Student extends Person {
    // 子类自己特有的属性.
    private int score;

    public Student(){
        super();
    }

    public Student(String name, int age, int score){
        super(name,age);
        this.score = score;
    }

    /*public Student(){
        super();
        System.out.println("我是子类的空参数构造方法..........");
    }

    public Student(int score){
        super();
        this.score = score;
        System.out.println("我是子类的带参数构造方法!!!");
    }*/

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
