package com.liujq.demo.designpattern.structure.flyweight;

/**
 * 蜡笔的抽象类
 *
 * @author Jiqiang.Liu
 * @date 2019-06-03
 */
public interface ICrayon {

    /**
     * 绘制
     * @param place 具体绘制的内容
     */
    void draw(String place);
}
