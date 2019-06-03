package com.liujq.demo.designpattern.behavior.state;

/**
 * 借款状态
 *
 * @author Jiqiang.Liu
 * @date 2019-06-03
 */
public class DrawState implements State {
    @Override
    public void register() {
        System.out.println("借款用户。不需要再注册。");
    }

    @Override
    public void apply() {
        System.out.println("借款用户。不需要再授信。");
    }

    @Override
    public void draw(double money) {
        System.out.println("申请借款【" + money + "】元。申请借款中。。。");
    }
}
