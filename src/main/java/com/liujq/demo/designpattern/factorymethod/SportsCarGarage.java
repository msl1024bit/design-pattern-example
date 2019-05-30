package com.liujq.demo.designpattern.factorymethod;

/**
 * 跑车仓库
 *
 * @author Jiqiang.Liu
 * @date 2019-05-30
 */
public class SportsCarGarage implements VehicleGarage {

    /**
     * 获得跑车
     *
     * @return
     */
    @Override
    public IVehicle getVehicle() {
        return new SportsCar();
    }
}
