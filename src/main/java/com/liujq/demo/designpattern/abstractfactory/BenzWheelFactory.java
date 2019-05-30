package com.liujq.demo.designpattern.abstractfactory;

/**
 * 奔驰方向盘工厂
 *
 * @author Jiqiang.Liu
 * @date 2019-05-30
 */
public class BenzWheelFactory implements WheelFactory {
    @Override
    public String produceWheel() {
        System.out.println("生产奔驰方向盘");
        return "奔驰方向盘";
    }
}
