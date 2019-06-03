package com.liujq.demo.designpattern.structure.decorator;

/**
 * 牛奶龟苓膏
 *
 * @author Jiqiang.Liu
 * @date 2019-06-03
 */
public class MilkHerbalJelly extends Decorator {
    public MilkHerbalJelly(HerbalJelly herbalJelly) {
        super(herbalJelly);
    }

    @Override
    public void process() {
        super.process();
        System.out.println("加牛奶");
    }
}
