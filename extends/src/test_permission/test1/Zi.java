package test_permission.test1;

public class Zi extends Fu {
    // 同一个包下, 被子类访问
    public void method() {
        super.show();
    }
}
