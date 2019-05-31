package com.liujq.demo.designpattern.create.abstractfactory;

/**
 * 方向盘工厂
 *
 * @author Jiqiang.Liu
 * @date 2019-05-30
 */
public interface WheelFactory {

    /**
     * 生产方向盘
     *
     * @return
     */
    String produceWheel();
}
