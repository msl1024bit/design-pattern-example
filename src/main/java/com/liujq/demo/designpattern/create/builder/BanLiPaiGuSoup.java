package com.liujq.demo.designpattern.create.builder;

/**
 * 板栗排骨汤
 *
 * @author Jiqiang.Liu
 * @date 2019-05-30
 */
public class BanLiPaiGuSoup implements Soup {
    @Override
    public void addMeat() {
        System.out.println("加排骨");
    }

    @Override
    public void addVegetables() {
        System.out.println("加板栗");
    }

    @Override
    public void waitMinute(int minute) {
        System.out.println("熬制" + minute + "分钟");
    }

    @Override
    public void addIngredients() {
        System.out.println("加盐");
    }
}
