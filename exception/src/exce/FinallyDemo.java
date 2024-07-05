package exce;

/**
 * @author: yuan.xin
 * @createTime: 2024/07/05 14:00
 * @contact: yuanxin9997@qq.com
 * @description: 使用finally回收资源
 */
public class FinallyDemo {
    public static void main(String[] Args) {
        try {
            int a=10;
            int b=0;
            int c=a/b;
        }catch(Exception e) {
            System.out.println("未知异常");
            return;
        }finally {
            System.out.println("资源回收");
        }
    }
}
