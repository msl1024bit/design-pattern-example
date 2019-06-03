package com.liujq.demo.designpattern.structure.bridge;

/**
 * 安卓手机
 *
 * @author Jiqiang.Liu
 * @date 2019-06-03
 */
public class AndroidPhone extends Phone {

    public AndroidPhone(Software software) {
        this.setSystem("android");
        this.setSoftware(software);
    }

    @Override
    public void openSoftware() {
        this.getSoftware().open(this);
    }
}
