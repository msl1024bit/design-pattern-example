package com.liujq.demo.designpattern.behavior.state;

/**
 * 状态抽象借款
 *
 * @author Jiqiang.Liu
 * @date 2019-06-03
 */
public interface State {

    /**
     * 注册
     */
    void register();

    /**
     * 授信
     */
    void apply();

    /**
     * 申请借款
     */
    void draw(double money);
}
