package com.liujq.demo.designpattern.behavior.visitor;

/**
 * 访问者接口
 *
 * @author Jiqiang.Liu
 * @date 2019-06-03
 */
public interface Visitor {
    void visit(Alibaba alibaba);
    void visit(Tencent tencent);
}
