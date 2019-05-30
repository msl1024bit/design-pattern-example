package com.liujq.demo.designpattern.abstractfactory;

/**
 * 宝马轮胎工厂
 *
 * @author Jiqiang.Liu
 * @date 2019-05-30
 */
public class BMWTyreFactory implements TyreFactory {
    @Override
    public String produceTyre() {
        System.out.println("生产BMW轮胎");
        return "BMW轮胎";
    }
}
