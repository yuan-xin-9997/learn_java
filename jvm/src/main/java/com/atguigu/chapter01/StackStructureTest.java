package com.atguigu.chapter01;

/**
 * @author: yuan.xin
 * @createTime: 2024/12/03 21:19
 * @contact: yuanxin9997@qq.com
 * @description: JVM 架构模型
 *
 * JVM 的架构模型
 * Java 编译器输入的指令流基本上是一种基于栈的指令集架构，另外一种指令集架
 * 构则是基于寄存器的指令集架构。具体来说：这两种架构之间的区别：
 *
 * 基于栈式架构的特点
 * • 设计和实现更简单，适用于资源受限的系统；
 * • 避开了寄存器的分配难题：使用零地址指令方式分配。
 * • 指令流中的指令大部分是零地址指令，其执行过程依赖于操作栈。指令集更小，
 * 编译器容易实现。
 * • 不需要硬件支持，可移植性更好，更好实现跨平台
 *
 * 基于寄存器架构的特点
 * 典型的应用是 x86 的二进制指令集：比如传统的 PC 以及 Android 的 Davlik
 * 虚拟机。
 * • 指令集架构则完全依赖硬件，可移植性差
 * • 性能优秀和执行更高效
 * • 花费更少的指令去完成一项操作。
 * • 在大部分情况下，基于寄存器架构的指令集往往都以一地址指令、二地址指令
 * 和三地址指令为主，而基于栈式架构的指令集却是以零地址指令为主方水洋
 *
 */
public class StackStructureTest {
    public static void main(String[] Args) throws InterruptedException {
        // int i = 2 + 3;
        int i = 2;
        int j = 3;
        int k = i + j;
        Thread.sleep(1000 * 60);
        System.out.println("hello");
    }
}
