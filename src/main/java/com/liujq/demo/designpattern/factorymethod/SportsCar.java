package com.liujq.demo.designpattern.factorymethod;

/**
 * @author Jiqiang.Liu
 * @date 2019-05-30
 */
public class SportsCar implements IVehicle {
    @Override
    public void run() {
        System.out.println("开跑车...");
    }
}
