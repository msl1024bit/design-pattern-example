package com.liujq.demo.designpattern.behavior.mediator;

import java.util.List;

/**
 * 中介类
 *
 * @author Jiqiang.Liu
 * @date 2019-05-31
 */
public abstract class Mediator {
    abstract void supplyHouse(List<String> types);
}
