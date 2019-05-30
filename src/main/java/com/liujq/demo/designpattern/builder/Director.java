package com.liujq.demo.designpattern.builder;

/**
 * 生产方
 *
 * @author Jiqiang.Liu
 * @date 2019-05-30
 */
public class Director {

    private BanLiPaiGuSoupBuilder banLiPaiGuSoupBuilder = new BanLiPaiGuSoupBuilder();

    private DongGuaPaiGuSoupBuilder dongGuaPaiGuSoupBuilder = new DongGuaPaiGuSoupBuilder();

    /**
     * 熬制冬瓜排骨汤
     *
     * @return
     */
    public DongGuaPaiGuSoup buildDongGuaPaiGuSoup() {
        dongGuaPaiGuSoupBuilder.buildSoup();
        return (DongGuaPaiGuSoup) dongGuaPaiGuSoupBuilder.getSoup();
    }

    /**
     * 熬制板栗排骨汤
     *
     * @return
     */
    public BanLiPaiGuSoup buildBanLiPaiGuSoup() {
        banLiPaiGuSoupBuilder.buildSoup();
        return (BanLiPaiGuSoup) banLiPaiGuSoupBuilder.getSoup();
    }
}
