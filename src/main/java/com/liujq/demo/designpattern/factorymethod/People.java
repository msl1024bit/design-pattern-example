package com.liujq.demo.designpattern.factorymethod;

/**
 * @author Jiqiang.Liu
 * @date 2019-05-30
 */
public class People {

    public void goTravel(IVehicle vehicle) {
        System.out.println("去旅游...");
        vehicle.run();
    }

    public void goSchool(IVehicle vehicle) {
        System.out.println("去学校...");
        vehicle.run();
    }
}
