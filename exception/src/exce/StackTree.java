package exce;

/**
 * @author: yuan.xin
 * @createTime: 2024/07/05 14:07
 * @contact: yuanxin9997@qq.com
 * @description: Java 异常堆栈信息
 */
public class StackTree {
    public static void main(String[] args) {
        fun1();//第4行
    }

    public static void fun1() {
        fun2();//第8行
    }

    public static void fun2() {
        fun3();
    }

    public static void fun3() {
        fun4();
    }

    public static void fun4() {
        throw new RuntimeException("我是异常信息");
    }
}
