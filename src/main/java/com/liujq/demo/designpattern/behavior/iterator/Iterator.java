package com.liujq.demo.designpattern.behavior.iterator;

/**
 * 自定义的迭代器
 *
 * @author Jiqiang.Liu
 * @date 2019-05-31
 */
public interface Iterator {

    /**
     * 是否还有下一个元素
     * @return
     */
    Boolean hasNext();

    /**
     * 获取下一个元素
     * @return
     */
    Object next();
}
