package com.liujq.demo.designpattern.behavior.visitor;

/**
 * @author Jiqiang.Liu
 * @date 2019-06-03
 */
public class Tencent extends Company {
    @Override
    void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String entertainBelowProvincialLeader(String leader) {
        return "Tencent 接待" + leader + "：八菜一汤";
    }

    public String entertainAboveNationalLeader(String leader) {
        return "Tencent 接待" + leader + "：十六菜两汤";
    }
}
