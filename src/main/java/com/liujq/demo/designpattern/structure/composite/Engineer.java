package com.liujq.demo.designpattern.structure.composite;

/**
 * 工程师（没有下属）
 *
 * @author Jiqiang.Liu
 * @date 2019-06-03
 */
public class Engineer extends Employee {

    public Engineer(String name) {
        this.setName(name);
    }

    @Override
    public void display(int index) {
        for(int i = 0; i < index; i++) {
            System.out.print("----");
        }
        System.out.println("工程师：" + this.getName());
    }
}
