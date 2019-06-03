package com.liujq.demo.designpattern.structure.bridge;

/**
 * 火狐浏览器软件
 *
 * @author Jiqiang.Liu
 * @date 2019-06-03
 */
public class FireFox implements Software {
    @Override
    public void open(Phone phone) {
        System.out.println("打开 " + phone.getSystem() + " 手机的 Firefox 浏览器");
    }
}
