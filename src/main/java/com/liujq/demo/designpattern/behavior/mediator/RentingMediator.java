package com.liujq.demo.designpattern.behavior.mediator;

import java.util.List;

/**
 * 租房中介
 *
 * @author Jiqiang.Liu
 * @date 2019-05-31
 */
public class RentingMediator extends Mediator {

    private NongMingFangLandlord nongMingFangLandlord = new NongMingFangLandlord();
    private XiaoQuFangLandlord xiaoQuFangLandlord = new XiaoQuFangLandlord();

    @Override
    void supplyHouse(List<String> types) {
        System.out.println("经纪人提供了如下房源:");

        if (types.contains("小区房")) {
            xiaoQuFangLandlord.supply();
        }

        if (types.contains("农民房")) {
            nongMingFangLandlord.supply();
        }
    }
}
