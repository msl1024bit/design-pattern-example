package com.liujq.demo.designpattern.structure.facade;

/**
 * 产品同学
 * 就不用直接和开发同学、测试同学沟通了，就跟技术组长对接就好。
 *
 * @author Jiqiang.Liu
 * @date 2019-06-03
 */
public class Demander {
    private Leader leader = new Leader();

    public void demand(String name) {
        System.out.println("提需求：" + name);
        leader.processDemand(name);
    }

}
