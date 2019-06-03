package com.liujq.demo.designpattern.structure.proxy;

import java.util.HashSet;
import java.util.Set;

/**
 * 中国网络
 *
 * @author Jiqiang.Liu
 * @date 2019-06-03
 */
public class ChineseNetwork implements Internet {

    private Internet internet;

    private Set<String> disables;

    public ChineseNetwork(Internet internet) {
        this.internet = internet;
        this.disables = new HashSet<>();
        this.disables.add("www.google.com");
        this.disables.add("www.facebook.com");
    }

    @Override
    public String access(String domain) {
        if (disables.contains(domain)) {
            System.out.println("禁止访问该网站：" + domain);
            return "禁止访问该网站：" + domain;
        }
        return internet.access(domain);
    }
}
