package com.liujq.demo.designpattern.behavior.strategy;

/**
 * 洗衣策略：标准
 *
 * @author Jiqiang.Liu
 * @date 2019-05-31
 */
public class StandardWashingStrategy implements WashingStrategy {
    @Override
    public void washing() {
        System.out.println("标准流程：");
        System.out.println("[浸泡] 10 分钟");
        System.out.println("[洗涤] 2 次，每次 15 分钟");
        System.out.println("[漂洗] 1 次，每次 10 分钟");
        System.out.println("[脱水] 5 分钟");
        System.out.println("总共耗时：55 分钟");
    }
}
