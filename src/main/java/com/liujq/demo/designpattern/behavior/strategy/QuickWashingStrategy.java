package com.liujq.demo.designpattern.behavior.strategy;

/**
 * 洗衣策略：快洗
 *
 * @author Jiqiang.Liu
 * @date 2019-05-31
 */
public class QuickWashingStrategy implements WashingStrategy {
    @Override
    public void washing() {
        System.out.println("快洗流程：");
        System.out.println("[洗涤] 1 次，每次 10 分钟");
        System.out.println("[漂洗] 1 次，每次 10 分钟");
        System.out.println("[脱水] 5 分钟");
        System.out.println("总共耗时：25 分钟");
    }
}
