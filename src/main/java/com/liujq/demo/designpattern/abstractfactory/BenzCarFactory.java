package com.liujq.demo.designpattern.abstractfactory;

/**
 * 奔驰汽车工厂
 *
 * @author Jiqiang.Liu
 * @date 2019-05-30
 */
public class BenzCarFactory implements AbstractCarFactory {
    @Override
    public void installTyre() {
        BenzTyreFactory benzTyreFactory = new BenzTyreFactory();
        String tyre = benzTyreFactory.produceTyre();
        System.out.println("安装轮胎:" + tyre);
    }

    @Override
    public void installWheel() {
        BenzWheelFactory benzWheelFactory = new BenzWheelFactory();
        String wheel = benzWheelFactory.produceWheel();
        System.out.println("安装方向盘:" + wheel);
    }
}
