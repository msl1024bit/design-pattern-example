package com.liujq.demo.designpattern.behavior.templatemethod;

/**
 * 鞋子组装工序模板框架
 *
 * @author Jiqiang.Liu
 * @date 2019-05-31
 */
public abstract class ShoeAssembleTemplate {

    /**
     * 组装鞋底
     */
    public abstract void assembleSole();

    /**
     * 组装鞋垫
     */
    public abstract void assembleInsole();

    /**
     * 组装鞋面
     */
    public abstract void assembleVamp();

    /**
     * 组装鞋垫
     */
    public abstract void assembleLace();

    public void assembleShoe() {
        System.out.println("组装一双鞋，步骤如下：");
        assembleSole();
        assembleInsole();
        assembleVamp();
        assembleLace();
    }
}
