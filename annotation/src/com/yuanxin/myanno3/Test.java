package com.yuanxin.myanno3;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//表示Test这个注解的存活时间
// 元注解
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Test {
}
