package com.liujq.demo.designpattern.behavior.command;

/**
 * 开始开发命令
 *
 * @author Jiqiang.Liu
 * @date 2019-05-31
 */
public class DevelopCommand extends Command {
    public DevelopCommand(Developer developer) {
        super(developer);
    }

    @Override
    public void execute(Requirement requirement) {
        this.developer.develop(requirement);
    }
}
