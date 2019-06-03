package com.liujq.demo.designpattern.behavior.visitor;

/**
 * 国家领导访问
 *
 * @author Jiqiang.Liu
 * @date 2019-06-03
 */
public class NationalLeaderVistor implements Visitor {
    @Override
    public void visit(Alibaba alibaba) {
        System.out.println(alibaba.entertainAboveNationalLeader("国家领导"));
    }

    @Override
    public void visit(Tencent tencent) {
        System.out.println(tencent.entertainAboveNationalLeader("国家领导"));
    }
}
