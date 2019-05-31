package com.liujq.demo.designpattern.create.factorymethod;

/**
 * 交通工具仓库
 *
 * @author Jiqiang.Liu
 * @date 2019-05-30
 */
public interface VehicleGarage {
    /**
     * 获得某类交通工具
     *
     * @return
     */
    IVehicle getVehicle();
}
