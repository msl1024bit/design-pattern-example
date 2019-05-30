package com.liujq.demo.designpattern.factorymethod;

/**
 * @author Jiqiang.Liu
 * @date 2019-05-30
 */
public class Motorcycle implements IVehicle {
    @Override
    public void run() {
        System.out.println("骑摩托车...");
    }
}
