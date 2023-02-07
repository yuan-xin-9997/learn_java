public class c01_operator {

    public static void main(String[] args) {
        //////算术运算符

//        int i0 = -3;
//        System.out.println(-i0);
//
//        // 当整数除以整数的时候，会把结果的小数部分舍弃，只保留整数部分
//        System.out.println(7 % 2);
//
////        int i = 0;
//        int k = ++i;
//        System.out.println(k);
//        System.out.println(i);
//
//        //字符串的加号是字符串的拼接
//        String str = "h" + "e" + "llo";
//        System.out.println(str);
//        System.out.println(-5 % 2);
//        System.out.println("5+5="+5+5);
//        System.out.println(5+5+"5+5=");
//        //char类型数据是可以做数学运算的，在做数学运算的时候，把字符转换为ASCII码，进行数学运算
//        System.out.println('*'+'\t'+'*');
//
//        //字符串与其他数据类型相加时，实际上是把其他数据转换为字符串，进行拼接运算
//        System.out.println("*" + '\t' + '*');

        //////赋值运算符
//        i = 1;
//        short s =2;
//        i = s;//自动类型转换
//        s = (short)i;//强制类型转换
//
//        int i1 = 0;
//        int i2= 0;
//        int i3 =0;
//
//        i1=i2=i3=1;//连续赋值
//        System.out.println(i1+","+i2+","+i3);
//        i =1;
////        i = i + 2;
//        i+=2;
//        System.out.println(i);
//
//        str = "he";
//        str += "llo";
//        System.out.println(str);
//
//        short s = 2;
//        s = (short)(s + 3);//变量参与运算的时候，java程序不知道具体的这个变量在做完运算后会不会超出当前数据类型的范围，所以会先把
//                            //变量转换为一个更大长度的数据类型，在这个例子中，short是一个短整型数据类型，会转换为默认的int
//        s += 3;//在使用扩展赋值运算符时，变量在参与运算时候，会把结果自动强制类型转换

//        int i = 1;
//        i *= 0.1;
////        i = (int) (i * 0.1);
//        System.out.println(i);
//
//        i++;
//        System.out.println(i);

        // 比较运算符
//        System.out.println(4==5);

        // 逻辑运算符
//        System.out.println(4 == 4 & 1 == 1);
//        System.out.println(4 == 4 || 1 != 1);
////        System.out.println(4 == 4 and 1 == 1);
//        int x = 4;
////        System.out.println(3 < x < 6); //不能这样写
//        System.out.println(x > 3 && x < 6);
//        int i = 0;
//        int k = 1;
//        // k++,++k
////        System.out.println(++k == 2);
////        System.out.println(i != 0 & ++k == 2);//单个&的时候，两边都要参与计算
//        System.out.println(i != 0 && ++k == 2);//两个&&的时候，如果左边为真，右边参与运算，如果左边为假，右边不参与运算
//        System.out.println(k);
//        int x = 1;
//        int y = 1;
//
//        if (x++ == 2 & ++y == 2){
//            //x++2，x先取值后计算，1==2，结果是false，再计算++之后x的值是2
//            //++y=2，y是先计算后取值，先计算++得到y的值为2，再判断逻辑2==2，结果是true
//            //false & true，得到的结论是false
//            x = 7;
//        }
//        System.out.println("x="+x+",y="+y);

        // 位运算符
//        System.out.println(~11);

        // 三元运算符
//        int i = 1;
//        int k = i > 0 ? 1 : 0;
//        System.out.println(k);

//        int m = 1;
//        int n = 2;
//        System.out.println(m > n ? m : 2);
//
//        int k = 0;
//        // (条件表达式)? 表达式1：表达式2；
//        System.out.println(m > n ? (m > k ? m :k) : (n > k ? n : k));
//
//        // 运算符的优先级
//        System.out.println(1 + 2 * 3);
//        System.out.println(2 * (3 % 2));//可以使用小括号()来提高想要先计算的那部分表达式的优先级

        // 程序流程控制
//        int i = 0;
//        int k = i;
//        int i = 1;
//        int k = 2;
//        if(i == 1 && k != 2){
//            System.out.println(i);
//        }
        // 判断一个数是奇数还是偶数，输出结果
//        int i = 2;
//        if(i % 2 == 0){
//            System.out.println("偶数");
//        }else{
//            System.out.println("奇数");
//        }

        // 如果是数字1，输出星期一，2输出星期二，3输出星期三
//        int i = 1;
//        if(i == 1){
//            System.out.println("星期一");
//        }else if(i == 2){
//            System.out.println("星期二");
//        }else if(i == 3){
//            System.out.println("星期三");
//        }else{
//            System.out.println("其他");
//        }

        // 分数
//        int score = 0;
//        if(score == 100){
//            System.out.println("奖励宝马");
//        }else if(score > 80 && score <= 99){
//            System.out.println("奖励一台iPhone 5s");
//        }else if(score >= 60 && score < 80){
//            System.out.println("奖励一本参考书");
//        }else{
//            System.out.println("None");
//        }

        // 练习
//        int x = 4;
//        int y = 1;
//        if (x > 2) {
//            if (y > 2) {
//                System.out.println(x + y);
//                System.out.println("atguigu");
//            }
//        } else {
//            System.out.println("x is " + x);
//        }

        //如果是数字1，输出星期一，数字2输出星期二，不是1和2的时候，输出不知道星期几
//        int i = 3;
//        switch (i){
//            case 1://if(i == 1)
//                System.out.println("Monday");
//                break;
//            case 2://else if(i == 1)
//                System.out.println("Tuesday");
//                break;
//            default://else
//                System.out.println("不知道星期几");
//                break;
//        }

//        String str = "a";
//        switch (str){
//            case "a":
//                System.out.println("a");
////                break;
//            case "b":
//                System.out.println("bod");
////                break;
//            default:
//                System.out.println("unknown");
////                break;
//        }

//        char c = 'a';
//        switch (c){
//            case 'a':
//                System.out.println('A');
//                break;
//            case 'b':
//                System.out.println('B');
//                break;
//            case 'c':
//                System.out.println('C');
//                break;
//            case 'd':
//                System.out.println('D');
//                break;
//            case 'e':
//                System.out.println('E');
//                break;
//            default:
//                System.out.println("other");
//                break;
//        }
//        int a =3;
//        int x = 100;
//        switch (a){
//            case 1:
//                x += 5;
//                break;
//            case 2:
//                x += 10;
//                break;
//            case 3:
//                x += 3;
//                break;
//            default:
//                x += 100;
//                break;
//        }

        //////////////循环结构
        //连续输出50次hello world
//        for(int i = 0; i < 5; i++){//初始化表达式①; 布尔值测试表达式②; 更改表达式③
//            System.out.println(i);
//            System.out.println("hello world");
//        }
//        int result = 0;
//        for(int i = 1; i < 100; i++){
//            result += i;
//        }

//        int result = 0;
//        for(int i=1; i<=100; i++) { result += i; }
//        System.out.println(result);

//        for(int i = 1; i <= 150; i++){
//            String str = "";
//            str += i;
////            System.out.println(str);
//            if(i % 3 == 0){
//                str += "foo";
//            }
//            if(i % 5 == 0){
//                str += "biz";
//            }
//            if(i % 7 == 0){
//                str += "baz";
//            }
//            System.out.println(str);
//        }

//        for(int i = 100; i <= 999; i++){
//            int m = i/100;//百位数，运算符 /:在Java语言中,整数之间的除法运算,不管你的小数位有多少位,小数是几,统统舍弃,只返回整数位数字!
//            int n = (i - m * 100)/10;//十位数
//            int k = i - m*100 - n*10;//个位数
////            System.out.println(m);
////            System.out.println(n);
////            System.out.println(k);
//            int res = m*m*m + n*n*n + k*k*k;
//            if(i == res){//判断水仙花数
//                System.out.println(i);
//            }
//        }

//        //循环输出1到100的数字
//        int i = 1;
//        while(i <= 100){
//            //获取变量i <= 100的计算结构，是true，还是false，是true就执行while的大括号里面的代码，否则跳出
//            System.out.println(i);
//            i++;//不断改变变量i的值
//        }

//        for(int k = 1;k<=100;k++){//与上面的循环等效
//            System.out.println(k);
//        }

//        int m =1;
//        do{
//            System.out.println(m);
//            m++;
//        }while(m<=100);

        //求求1到100之间所有偶数的和。用for和while语句分别完成。
//        int res = 0;
//        for(int i = 1;i<=100;i++){
//            if(i % 2 == 0){
//                res += i;
//            }
//        }
//        System.out.println(res);
//
//        int k = 1;
//        int res0 = 0;
//        while(k<=100){
//            if(k % 2 == 0){
//                res0 += k;
//            }
//            k++;
//        }
//        System.out.println(res0);

        //嵌套循环
//        for(int i = 0;i<4;i++){
//            System.out.println("大循环---" + i);
//            for(int j = 0;j <2;j++){
//                System.out.println("大循环---" + i+"小循环---"+j);
//                System.out.println(i+j);
//
//            }
//        }
        //注意：在写嵌套循环的时候，要保证外层循环的循环次数小于内层的循环次数
//        for(int i = 1;i<900;i++){
//            for(int j=0;j<20;j++){
//                System.out.println("在编写代码的时候，如果内层和外层循环，正反都可以达到同样的效果，要尽量使用这种方式，外循环次数小于内循环次数");
//                break;
//            }
//        }

        //使用嵌套循环，打印99乘法表
//        for(int i=1;i<=9;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(i + "x" + j + "=" + (i*j) + "  ");//print不换行
//            }
//            System.out.println();//换行
//        }
//        System.out.println("x"+9);

        //输出1-100之间的所有质数（大于1的自然数，并且只能被1和本身整除）
//        for(int i = 1; i<=100; i++){
//            int count = 0;
//            for(int j = 1;j <= i; j++){
//                if(i % j == 0){
//                    count += 1;
//                }
//            }
//            if(count == 2){
//                System.out.println("数" + i + "是质数");
//            }
//        }

        //特殊流程控制语句
//        String s = null;
//        s.concat("abc");
//        实际上，这些运算符有两种形式;上面介绍的是运算符放在操作数后面的"后缀"（n++）形式。
//还有一种"前缀"形式∶++n。后缀和前缀形式都会使变量值加1或减1。但用在表达式中时，
//二者就有区别了。前缀形式会先完成加1;而后缀形式会使用变量原来的值。
        int a = 100;
        int b = 50;
        int c = a-- - b;

        System.out.println(c);
        System.out.println(a);
        System.out.println(b);
        System.out.println("-----");
        int d = a-- - b;
        System.out.println(d);
        System.out.println(a);
        System.out.println(b);

        // 调用方法
        int num = 10;
        isEvenNumber(num);

        boolean flag = isEven(10);
        System.out.println(flag);

        // 当参与/运算的两个操作数都是整数时，表示整数除法;否则，表示浮点除法。
        System.out.println(10 / 3);

        System.out.println(isFlower(111));
        System.out.println(isFlower(153));

        for (int i=100;i<1000;i+=1){
            if(isFlower(i)){
                System.out.println(i);
            }
        }

        // 方法重载
        // 调用方法的时候，Java虚拟机会通过参数的不同调用不同的同名的方法
        System.out.println(sum(10, 20));
        System.out.println(sum(10.0, 20.0));
        System.out.println(sum(10, 20, 30));

        System.out.println(compare(10, 20));
        System.out.println(compare((byte)10, (byte)20));
        System.out.println(compare((short)10, (short)20));
        System.out.println(compare(10L, 20L));

    }

    // void 表示方法没有返回值
    public static void isEvenNumber(int num) {
        // int num = 11;
        char s = 'f';
        System.out.println("-------");
        if (num % 2 == 0) {
            System.out.println(num + "是偶数");
        }else{
            System.out.println(num + "不是偶数");
        }
    }

    public static void getMax(int a, int b) {
        if(a>=b){
            System.out.println("较大的数是" + a);
        }else {
            System.out.println("较大的数是" + b);
        }
    }

    // 有返回值的方法，没有void，但必须加返回值的类型
    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        }else{
            return false;
        }
    }

    // 判断某个数是否为水仙花数
    public static boolean isFlower(int num) {
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100 % 10;
        if (Math.pow(ge, 3) + Math.pow(shi, 3) + Math.pow(bai, 3) == num){
            return true;
        }
        return false;
    }

    // 求两个int类型数据和的方法
    public static int sum(int a, int b){
        return a + b;
    }
    // 求两个double类型数据和的方法
    public static double sum(double a, double b){
        return a + b;
    }
    // 求三个int类型数据和的方法
    public static int sum(int a, int b, int c){
        return a + b+c;
    }

    // 判断int类型的两个数据是否相等
    public static boolean compare(int a, int b) {
        System.out.println("int");
        return a == b;
    }
    // 判断byte类型的两个数据是否相等
    public static boolean compare(byte a, byte b) {
        System.out.println(a);
        System.out.println(b);
        System.out.println("byte");
        return a == b;
    }
    // 判断short类型的两个数据是否相等
    public static boolean compare(short a, short b) {
        System.out.println(a);
        System.out.println(b);
        System.out.println("short");
        return a == b;
    }
    // 判断long类型的两个数据是否相等
    public static boolean compare(long a, long b) {
        System.out.println(a);
        System.out.println(b);
        System.out.println("long");
        return a == b;
    }


}
