package com.liujq.demo.designpattern.structure.decorator;

/**
 * 蜂蜜龟苓膏
 *
 * @author Jiqiang.Liu
 * @date 2019-06-03
 */
public class HoneyHerbalJelly extends Decorator {
    public HoneyHerbalJelly(HerbalJelly herbalJelly) {
        super(herbalJelly);
    }

    @Override
    public void process() {
        super.process();
        System.out.println("加蜂蜜");
    }
}
