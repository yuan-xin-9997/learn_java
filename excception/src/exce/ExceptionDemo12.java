package exce;


import java.util.Scanner;

public class ExceptionDemo12 {
    public static void main(String[] args) {
        // 键盘录入学生的姓名和年龄,其中年龄为 18 - 25岁,
        // 超出这个范围是异常数据不能赋值.需要重新录入,一直录到正确为止。

        Student s = new Student();

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名");
        String name = sc.nextLine();
        s.setName(name);
       while(true){
           System.out.println("请输入年龄");
           String ageStr = sc.nextLine();
           try {
               int age = Integer.parseInt(ageStr);
               s.setAge(age);
               break;
           } catch (NumberFormatException e) {
               System.out.println("请输入一个整数");
               continue;
           } catch (AgeOutOfBoundsException e) {
               System.out.println(e.toString());
               System.out.println("请输入一个符合范围的年龄");
               continue;
           }
           /*if(age >= 18 && age <=25){
               s.setAge(age);
               break;
           }else{
               System.out.println("请输入符合要求的年龄");
               continue;
           }*/
       }
        System.out.println(s);

    }
}
