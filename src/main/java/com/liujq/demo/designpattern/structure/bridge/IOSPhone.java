package com.liujq.demo.designpattern.structure.bridge;

/**
 * 苹果手机
 *
 * @author Jiqiang.Liu
 * @date 2019-06-03
 */
public class IOSPhone extends Phone {

    public IOSPhone(Software software) {
        this.setSystem("ios");
        this.setSoftware(software);
    }

    @Override
    public void openSoftware() {
        this.getSoftware().open(this);
    }
}
