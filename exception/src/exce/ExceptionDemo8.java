package exce;



public class ExceptionDemo8 {
    public static void main(String[] args) {
        //int [] arr = {1,2,3,4,5};
        int [] arr = null;
        printArr(arr);//就会 接收到一个异常.
                        //我们还需要自己处理一下异常.
    }

    private static void printArr(int[] arr) {
        if(arr == null){
            //调用者知道成功打印了吗?
            //System.out.println("参数不能为null");
            throw new NullPointerException(); //当参数为null的时候
                                                //手动创建了一个异常对象,抛给了调用者.  类似于Python的Raise Exception
        }else{
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
    }



}
