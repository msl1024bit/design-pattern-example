package com.liujq.demo.designpattern.abstractfactory;

/**
 * 抽象汽车工厂
 *
 * @author Jiqiang.Liu
 * @date 2019-05-30
 */
public interface AbstractCarFactory {

    /**
     * 组装轮胎
     */
    void installTyre();

    /**
     * 组装方向盘
     */
    void installWheel();
}
