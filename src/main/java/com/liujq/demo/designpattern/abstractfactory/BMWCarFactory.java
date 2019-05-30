package com.liujq.demo.designpattern.abstractfactory;

/**
 * 宝马汽车工厂
 *
 * @author Jiqiang.Liu
 * @date 2019-05-30
 */
public class BMWCarFactory implements AbstractCarFactory {
    @Override
    public void installTyre() {
        BMWTyreFactory bmwTyreFactory = new BMWTyreFactory();
        String tyre = bmwTyreFactory.produceTyre();
        System.out.println("安装轮胎:" + tyre);
    }

    @Override
    public void installWheel() {
        BMWWheelFactory bmwWheelFactory = new BMWWheelFactory();
        String wheel = bmwWheelFactory.produceWheel();
        System.out.println("安装方向盘:" + wheel);
    }
}
