package com.yuanxin.myhashset;
/*

 */
public class HashSetDemo2 {
    public static void main(String[] args) {
        Student s1 = new Student("xiaozhi", 23);
        Student s2 = new Student("xiaomei", 26);
        // 在Object类中，是根据对象的地址值计算出来的哈希值
        System.out.println(s1.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
