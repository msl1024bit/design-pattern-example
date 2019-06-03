package com.liujq.demo.designpattern.behavior.state;

import lombok.Getter;
import lombok.Setter;

/**
 * 用户
 *
 * @author Jiqiang.Liu
 * @date 2019-06-03
 */
@Getter
@Setter
public class User {
    private State state;

    public void register() {
        this.state.register();
    }

    public void apply() {
        this.state.apply();
    }

    public void draw(double money) {
        this.state.draw(money);
    }
}
