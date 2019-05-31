package com.liujq.demo.designpattern.create.builder;

/**
 * 熬汤建造者
 *
 * @author Jiqiang.Liu
 * @date 2019-05-30
 */
public interface SoupBuilder {

    /**
     * 熬汤
     */
    void buildSoup();

    /**
     * 得到熬好的烫
     *
     * @return
     */
    Soup getSoup();
}
