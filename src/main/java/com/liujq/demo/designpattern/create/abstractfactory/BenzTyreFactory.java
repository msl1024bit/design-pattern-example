package com.liujq.demo.designpattern.create.abstractfactory;

/**
 * 奔驰轮胎工厂
 *
 * @author Jiqiang.Liu
 * @date 2019-05-30
 */
public class BenzTyreFactory implements TyreFactory {
    @Override
    public String produceTyre() {
        System.out.println("生产奔驰轮胎");
        return "奔驰轮胎";
    }
}
