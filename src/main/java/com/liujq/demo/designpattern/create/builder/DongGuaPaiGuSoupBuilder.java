package com.liujq.demo.designpattern.create.builder;

/**
 * 冬瓜排骨汤建造者
 *
 * @author Jiqiang.Liu
 * @date 2019-05-30
 */
public class DongGuaPaiGuSoupBuilder implements SoupBuilder {

    private DongGuaPaiGuSoup dongGuaPaiGuSoup = new DongGuaPaiGuSoup();

    @Override
    public void buildSoup() {
        // 加排骨
        dongGuaPaiGuSoup.addMeat();

        // 熬制30分钟
        dongGuaPaiGuSoup.waitMinute(30);

        // 加冬瓜
        dongGuaPaiGuSoup.addVegetables();

        // 熬制10分钟
        dongGuaPaiGuSoup.waitMinute(10);

        // 加盐加香菜
        dongGuaPaiGuSoup.addIngredients();
    }

    @Override
    public Soup getSoup() {
        return dongGuaPaiGuSoup;
    }
}
