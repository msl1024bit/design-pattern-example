package com.liujq.demo.designpattern.structure.decorator;

/**
 * 普通龟苓膏
 *
 * @author Jiqiang.Liu
 * @date 2019-06-03
 */
public class CommonHerbalJelly extends HerbalJelly {
    @Override
    public void process() {
        System.out.println("盛一碗龟苓膏");
    }
}
