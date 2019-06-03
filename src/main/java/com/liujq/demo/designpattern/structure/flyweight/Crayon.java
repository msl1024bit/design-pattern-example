package com.liujq.demo.designpattern.structure.flyweight;

/**
 * 蜡笔
 *
 * @author Jiqiang.Liu
 * @date 2019-06-03
 */
public class Crayon implements ICrayon {

    private String color;

    public Crayon(String color) {
        System.out.println("---新建【" + color + "】蜡笔");
        this.color = color;
    }

    @Override
    public void draw(String place) {
        System.out.println("用" + this.color + "蜡笔画" + place);
    }
}
