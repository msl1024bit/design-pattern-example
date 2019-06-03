package com.liujq.demo.designpattern.structure.proxy;

/**
 * 世界网络
 *
 * @author Jiqiang.Liu
 * @date 2019-06-03
 */
public class WorldNetwork implements Internet {
    @Override
    public String access(String domain) {
        System.out.println("访问网站：" + domain);
        return domain + "网站内容";
    }
}
