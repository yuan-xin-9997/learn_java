package com.yuanxin.demo5;

/**
 * 泛型接口的实现类，是一个泛型类，那么要保证实现接口的泛型类泛型标识包含泛型接口的泛型标识
 * @param <T> 多个标识，泛型扩充
 * @param <E>
 * 注意：<>中间的标识顺序不重要
 */
public class Pair<E, T> implements Generator<T> {

    private T key;
    private E value;

    public Pair(T key, E value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public T getKey() {
        return key;
    }

    public E getValue() {
        return value;
    }
}
