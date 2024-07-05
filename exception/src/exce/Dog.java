package exce;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public void lookHome(){
        System.out.println("狗看家");
    }
}
