package exce;


import java.util.ArrayList;
import java.util.Iterator;

public class ExceptionDemo3 {
    //创建一个ArrayList集合,添加一些元素 "aaa" "bbb" "bbb" "ccc" "bbb" null
    //遍历集合,并统计集合中有多少个"bbb"
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("bbb");
        list.add("ccc");
        list.add("bbb");
        list.add(null);

        int count = 0;
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            if("bbb".equals(it.next())){
                count++;
            }
        }
        System.out.println("在集合中一共出现bbb有" + count+ "次");

    }
}
