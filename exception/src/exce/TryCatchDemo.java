package exce;

/**
 * @author: yuan.xin
 * @createTime: 2024/07/05 13:52
 * @contact: yuanxin9997@qq.com
 * @description: 使用try...catch捕获异常
 */
public class TryCatchDemo {
    public static void main(String[] Args) {
        try {
            int a=Integer.parseInt(Args[0]);
            int b=Integer.parseInt(Args[1]);
            int c=a/b;
            System.out.println("您输入的两个数相除的结果是"+c);
        }catch(IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            //System.out.println(e.getStackTrace());
            System.out.println("数组越界，运行时参数不够");
        }catch(NumberFormatException e) {
            System.out.println("数字格式异常");
        }catch(ArithmeticException e) {
            System.out.println("算术异常");
        }catch(Exception e) {
            System.out.println("未知异常");
        }
    }
}
