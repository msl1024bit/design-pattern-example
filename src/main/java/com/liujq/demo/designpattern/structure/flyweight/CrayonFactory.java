package com.liujq.demo.designpattern.structure.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 蜡笔容器
 *
 * @author Jiqiang.Liu
 * @date 2019-06-03
 */
public class CrayonFactory {

    private static Map<String, ICrayon> data = new ConcurrentHashMap<>();

    /**
     * 获取蜡笔
     * @param color
     * @return
     */
    public static ICrayon getCrayon(String color) {
        if (data.containsKey(color)) {
            return data.get(color);
        }
        Crayon crayon = new Crayon(color);
        data.put(color, crayon);
        return crayon;
    }
}
