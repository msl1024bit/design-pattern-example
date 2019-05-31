package com.liujq.demo.designpattern.behavior.iterator;

/**
 * 自定义迭代器实现类
 *
 * @author Jiqiang.Liu
 * @date 2019-05-31
 */
public class IteratorImpl implements Iterator {

    private List list;
    private int index;

    public IteratorImpl(List list) {
        this.list = list;
        this.index = 0;
    }

    @Override
    public Boolean hasNext() {
        return index < list.size();
    }

    @Override
    public Object next() {
        return list.get(index++);
    }
}
