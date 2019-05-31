package com.liujq.demo.designpattern.behavior.command;

import lombok.Setter;

/**
 * 技术经理
 *
 * @author Jiqiang.Liu
 * @date 2019-05-31
 */
public class TechnicalManager {

    private String name;

    @Setter
    private Command command;

    public TechnicalManager(String name) {
        this.name = name;
    }

    public void action(Requirement requirement) {
        command.execute(requirement);
    }
}
