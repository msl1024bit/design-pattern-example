package com.liujq.demo.designpattern.behavior.iterator;

/**
 * 自定义的List接口
 *
 * @author Jiqiang.Liu
 * @date 2019-05-31
 */
public interface List {

    /**
     * 获取迭代器
     * @return
     */
    Iterator iterator();

    /**
     * 添加元素
     * @param object
     */
    void add(Object object);

    /**
     * 获取指定下标的元素
     * @param index
     * @return
     */
    Object get(int index);

    /**
     * 获取集合中元素的个数
     * @return
     */
    int size();
}
