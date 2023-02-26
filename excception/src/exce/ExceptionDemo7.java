package exce;



public class ExceptionDemo7 {
    public static void main(String[] args) {
        System.out.println("家里有一个貌美如花的老婆");
        System.out.println("还有一个当官的兄弟");
        System.out.println("自己还有一个买卖");
        System.out.println("这样的生活你要不要?");
        throw new RuntimeException(); //当代码执行到这里,就创建一个异常对象
                                    //该异常创建之后,暂时没有手动处理.抛给了调用者处理
                                    //下面的代码不会再执行了.
        //System.out.println("武大郎的标准生活");
    }


}
