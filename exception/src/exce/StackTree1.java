package exce;

/**
 * @author: yuan.xin
 * @createTime: 2024/07/05 14:39
 * @contact: yuanxin9997@qq.com
 * @description: 构建带原因的异常栈
 */
public class StackTree1 {
    public static void main(String[] args) {
        fun1();
    }

    public static void fun1() {
        fun2();
    }

    public static void fun2() {
        fun3();
    }

    public static void fun3() {
        try {
            fun4();
        } catch (Exception e) {
            throw new RuntimeException("fun3",e);
        }
    }

    public static void fun4() {
        throw new RuntimeException("fun4");
    }
}
