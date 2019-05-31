package com.liujq.demo.designpattern.behavior.mediator;

/**
 * 农民房房东
 *
 * @author Jiqiang.Liu
 * @date 2019-05-31
 */
public class NongMingFangLandlord extends Landlord {
    @Override
    void supply() {
        System.out.println("农民房的房东提供一间小区房");
    }
}
