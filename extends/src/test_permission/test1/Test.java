package test_permission.test1;

public class Test {
    public static void main(String[] args) {
        // 同一个包下, 无关类访问
        Fu f = new Fu();
        f.show();
    }
}
