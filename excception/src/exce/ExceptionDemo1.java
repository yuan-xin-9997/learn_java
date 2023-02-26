package exce;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionDemo1 {
    public static void main(String[] args) throws ParseException {
//        int [] arr = {1,2,3,4,5};
//        System.out.println(arr[10]);//ArrayIndexOutOfBoundsException


//        String s = null;
//        System.out.println(s.equals("嘿嘿"));//NullPointerException

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        sdf.parse("2048-1月1日");//ParseException
    }
}
