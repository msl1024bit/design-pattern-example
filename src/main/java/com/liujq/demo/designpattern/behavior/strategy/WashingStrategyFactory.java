package com.liujq.demo.designpattern.behavior.strategy;

/**
 * 获取洗衣策略工厂类
 *
 * @author Jiqiang.Liu
 * @date 2019-05-31
 */
public class WashingStrategyFactory {
    private String type;

    public WashingStrategy getStrategy(String type) {
        if ("Standard".equals(type)) {
            return new StandardWashingStrategy();
        }

        if ("Quick".equals(type)) {
            return new QuickWashingStrategy();
        }

        if ("BigClothes".equals(type)) {
            return new BigClothesWashingStrategy();
        }

        if ("Soft".equals(type)) {
            return new SoftWashingStrategy();
        }
        return null;
    }
}
