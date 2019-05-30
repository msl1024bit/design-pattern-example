package com.liujq.demo.designpattern.factorymethod;

/**
 * 摩托车仓库
 *
 * @author Jiqiang.Liu
 * @date 2019-05-30
 */
public class MotorcycleGarage implements VehicleGarage {

    /**
     * 获得摩托车
     *
     * @return
     */
    @Override
    public IVehicle getVehicle() {
        return new Motorcycle();
    }
}
