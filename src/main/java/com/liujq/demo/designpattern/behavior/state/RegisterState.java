package com.liujq.demo.designpattern.behavior.state;

/**
 * 注册状态
 *
 * @author Jiqiang.Liu
 * @date 2019-06-03
 */
public class RegisterState implements State {
    @Override
    public void register() {
        System.out.println("注册用户。不需要再注册。");
    }

    @Override
    public void apply() {
        System.out.println("注册用户。授信申请中。。。");
    }

    @Override
    public void draw(double money) {
        System.out.println("注册用户。申请借款【" + money + "】元。还没授信，不能借款。");
    }
}
