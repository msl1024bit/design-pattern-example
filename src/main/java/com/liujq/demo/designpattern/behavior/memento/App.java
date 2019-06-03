package com.liujq.demo.designpattern.behavior.memento;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * App
 *
 * @author Jiqiang.Liu
 * @date 2019-06-03
 */
@Data
@AllArgsConstructor
public class App {

    /**
     * 应用内容
     */
    private String content;

    /**
     * 应用版本号
     */
    private String version;
}
