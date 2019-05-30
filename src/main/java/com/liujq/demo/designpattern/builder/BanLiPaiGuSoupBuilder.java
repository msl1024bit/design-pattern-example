package com.liujq.demo.designpattern.builder;

/**
 * @author Jiqiang.Liu
 * @date 2019-05-30
 */
public class BanLiPaiGuSoupBuilder implements SoupBuilder {

    private BanLiPaiGuSoup banLiPaiGuSoup = new BanLiPaiGuSoup();

    @Override
    public void buildSoup() {
        // 加排骨
        banLiPaiGuSoup.addMeat();

        //加板栗
        banLiPaiGuSoup.addVegetables();

        // 熬制40分钟
        banLiPaiGuSoup.waitMinute(40);

        // 加盐
        banLiPaiGuSoup.addIngredients();
    }

    @Override
    public Soup getSoup() {
        return banLiPaiGuSoup;
    }
}
