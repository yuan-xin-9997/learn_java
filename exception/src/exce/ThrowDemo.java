package exce;

/**
 * @author: yuan.xin
 * @createTime: 2024/07/05 13:37
 * @contact: yuanxin9997@qq.com
 * @description: 使用throw抛出异常
 */
public class ThrowDemo {
    public static void main(String[] Args) {
        try {
            System.out.println(Args.length);
            for (int i = 0; i < Args.length; i++) {
                System.out.println(Args[i]);
            }
            int a=Integer.parseInt(Args[0]);
            int b=Integer.parseInt(Args[1]);
            if(b==0) {
                System.out.println("b=0");
                throw new Exception("除数不能为0");
            }
            int c=a/b;
            System.out.println("会打印吗");
            System.out.println("您输入的两个数相除的结果是"+c);
        }catch(Exception e) {
            System.out.println("未知异常");
        }
    }
}
