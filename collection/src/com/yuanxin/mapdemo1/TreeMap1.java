package com.yuanxin.mapdemo1;

/*
需求：创建一个TreeMap集合，键是学生对象(Student)，值是籍贯(String)。
          学生属性姓名和年龄，按照年龄进行排序并遍历。

 */

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMap1 {
    public static void main(String[] args) {
        TreeMap<StudentTM, String> tm = new TreeMap<>(
                new Comparator<StudentTM>() {
                    @Override
                    public int compare(StudentTM o1, StudentTM o2) {
                        // 按照年龄排序
                        int result = -1 * (o1.getAge() - o2.getAge());
                        // 次要条件：按照姓名排序
                        result = result == 0 ? o1.getName().compareTo(o2.getName()):result;
                        return result;
                    }
                }
        );
        StudentTM s1 = new StudentTM("xiaohei",23);
        StudentTM s2 = new StudentTM("dapang",22);
        StudentTM s3 = new StudentTM("xiaomei",22);

        // 键 对象，值 String
        tm.put(s1,"江苏");
        tm.put(s2,"北京");
        tm.put(s3,"天津");

        tm.forEach(
                (StudentTM key, String value)->{
                    System.out.println(key + "=======" +value);
                }
        );
    }
}
