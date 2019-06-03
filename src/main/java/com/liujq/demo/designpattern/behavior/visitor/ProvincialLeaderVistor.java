package com.liujq.demo.designpattern.behavior.visitor;

/**
 * 省领导访问
 *
 * @author Jiqiang.Liu
 * @date 2019-06-03
 */
public class ProvincialLeaderVistor implements Visitor {
    @Override
    public void visit(Alibaba alibaba) {
        System.out.println(alibaba.entertainBelowProvincialLeader("省领导"));
    }

    @Override
    public void visit(Tencent tencent) {
        System.out.println(tencent.entertainBelowProvincialLeader("省领导"));
    }
}
