package com.liujq.demo.designpattern.structure.decorator;

/**
 * 龟苓膏装饰器
 *
 * @author Jiqiang.Liu
 * @date 2019-06-03
 */
public class Decorator extends HerbalJelly {

    private HerbalJelly herbalJelly;

    public Decorator(HerbalJelly herbalJelly) {
        this.herbalJelly = herbalJelly;
    }

    @Override
    public void process() {
        this.herbalJelly.process();
    }
}
