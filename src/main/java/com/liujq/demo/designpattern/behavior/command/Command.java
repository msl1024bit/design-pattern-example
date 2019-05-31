package com.liujq.demo.designpattern.behavior.command;

/**
 * @author Jiqiang.Liu
 * @date 2019-05-31
 */
public abstract class Command {
    protected Developer developer;
    public Command(Developer developer) {
        this.developer = developer;
    }

    public abstract void execute(Requirement requirement);
}
