package com.liujq.demo.designpattern.behavior.visitor;

/**
 * 阿里巴巴企业
 *
 * @author Jiqiang.Liu
 * @date 2019-06-03
 */
public class Alibaba extends Company {
    @Override
    void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String entertainBelowProvincialLeader(String leader) {
        return "Alibaba 接待" + leader + "：十菜一汤";
    }

    public String entertainAboveNationalLeader(String leader) {
        return "Alibaba 接待" + leader + "：十四菜两汤";
    }
}
