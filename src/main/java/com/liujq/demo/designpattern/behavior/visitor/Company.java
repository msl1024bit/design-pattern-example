package com.liujq.demo.designpattern.behavior.visitor;

/**
 * @author Jiqiang.Liu
 * @date 2019-06-03
 */
public abstract class Company {
    abstract void accept(Visitor visitor);
}
