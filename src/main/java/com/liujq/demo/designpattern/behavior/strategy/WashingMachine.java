package com.liujq.demo.designpattern.behavior.strategy;

/**
 * 洗衣机
 *
 * @author Jiqiang.Liu
 * @date 2019-05-31
 */
public class WashingMachine {
    private WashingStrategy washingStrategy;
    public WashingMachine(WashingStrategy washingStrategy) {
        this.washingStrategy = washingStrategy;
    }

    public void washClothes() {
        washingStrategy.washing();
    }
}
