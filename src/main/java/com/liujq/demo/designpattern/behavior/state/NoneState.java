package com.liujq.demo.designpattern.behavior.state;

/**
 * 游客状态
 *
 * @author Jiqiang.Liu
 * @date 2019-06-03
 */
public class NoneState implements State {
    @Override
    public void register() {
        System.out.println("游客：注册中...");
    }

    @Override
    public void apply() {
        System.out.println("游客：不能申请授信");
    }

    @Override
    public void draw(double money) {
        System.out.println("游客。申请借款【" + money + "】元。不能申请借款。");
    }
}
