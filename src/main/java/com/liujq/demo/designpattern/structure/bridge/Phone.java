package com.liujq.demo.designpattern.structure.bridge;

import lombok.Data;

/**
 * 手机抽象类
 *
 * @author Jiqiang.Liu
 * @date 2019-06-03
 */
@Data
public abstract class Phone {
    private String system;
    private Software software;
    public abstract void openSoftware();
}
