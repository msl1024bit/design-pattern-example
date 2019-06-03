package com.liujq.demo.designpattern.structure.facade;

/**
 * 技术组长
 * 负责跟进整个需求的开发测试过程。
 *
 * @author Jiqiang.Liu
 * @date 2019-06-03
 */
public class Leader {
    private Developer developer = new Developer();
    private Tester tester = new Tester();

    public void processDemand(String name) {
        developer.develop(name);
        tester.test(name);
    }
}
