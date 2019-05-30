package com.liujq.demo.designpattern.builder;

/**
 * 煲汤接口
 * <p>表明煲汤有哪些流程</p>
 *
 * @author Jiqiang.Liu
 * @date 2019-05-30
 */
public interface Soup {

    /**
     * 加肉
     */
    void addMeat();

    /**
     * 加蔬菜
     */
    void addVegetables();

    /**
     * 熬制
     * @param minute 熬制时间
     */
    void waitMinute(int minute);

    /**
     * 加调料
     */
    void addIngredients();
}
