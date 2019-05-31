package com.liujq.demo.designpattern.create.abstractfactory;

/**
 * 宝马方向盘工厂
 *
 * @author Jiqiang.Liu
 * @date 2019-05-30
 */
public class BMWWheelFactory implements WheelFactory {
    @Override
    public String produceWheel() {
        System.out.println("生产BMW方向盘");
        return "BMW方向盘";
    }
}
