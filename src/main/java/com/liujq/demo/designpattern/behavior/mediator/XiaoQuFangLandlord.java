package com.liujq.demo.designpattern.behavior.mediator;

/**
 * 小区房房东
 *
 * @author Jiqiang.Liu
 * @date 2019-05-31
 */
public class XiaoQuFangLandlord extends Landlord {
    @Override
    void supply() {
        System.out.println("小区房的房东提供一间小区房");
    }
}
