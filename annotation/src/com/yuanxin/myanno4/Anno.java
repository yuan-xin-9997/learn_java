package com.yuanxin.myanno4;

import java.lang.annotation.*;

@Target({ElementType.FIELD,ElementType.TYPE,ElementType.METHOD})  //指定注解使用的位置（Field对应成员变量，Type对应类，Method对应成员方法）
@Retention(RetentionPolicy.RUNTIME) //指定该注解的存活时间，可以存货在运行时阶段
//@Inherited //指定该注解可以被继承，即父类的子类也有该注解
public @interface Anno {
}
