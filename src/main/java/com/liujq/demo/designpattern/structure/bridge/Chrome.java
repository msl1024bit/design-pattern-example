package com.liujq.demo.designpattern.structure.bridge;

/**
 * 谷歌浏览器软件
 *
 * @author Jiqiang.Liu
 * @date 2019-06-03
 */
public class Chrome implements Software {
    @Override
    public void open(Phone phone) {
        System.out.println("打开 " + phone.getSystem() + " 手机的 Chrome 浏览器");
    }
}
