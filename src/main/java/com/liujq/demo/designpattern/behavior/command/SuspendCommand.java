package com.liujq.demo.designpattern.behavior.command;

/**
 * 暂停开发命令
 *
 * @author Jiqiang.Liu
 * @date 2019-05-31
 */
public class SuspendCommand extends Command {
    public SuspendCommand(Developer developer) {
        super(developer);
    }

    @Override
    public void execute(Requirement requirement) {
        this.developer.suspend(requirement);
    }
}
