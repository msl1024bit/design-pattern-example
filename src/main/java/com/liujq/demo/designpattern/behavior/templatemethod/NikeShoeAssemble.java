package com.liujq.demo.designpattern.behavior.templatemethod;

/**
 * Nike鞋制造
 *
 * @author Jiqiang.Liu
 * @date 2019-05-31
 */
public class NikeShoeAssemble extends ShoeAssembleTemplate {
    @Override
    public void assembleSole() {
        System.out.println("组装nike鞋底");
    }

    @Override
    public void assembleInsole() {
        System.out.println("组装nike鞋垫");
    }

    @Override
    public void assembleVamp() {
        System.out.println("组装nike鞋面");
    }

    @Override
    public void assembleLace() {
        System.out.println("组装nike鞋带");
    }
}
