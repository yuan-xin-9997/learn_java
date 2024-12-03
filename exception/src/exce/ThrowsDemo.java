package exce;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author: yuan.xin
 * @createTime: 2024/07/05 13:49
 * @contact: yuanxin9997@qq.com
 * @description: 使用throws声明抛出异常
 */
public class ThrowsDemo {
    public static void main(String[] Args) throws FileNotFoundException {
        FileInputStream fis=new FileInputStream("a.txt");
    }
}
