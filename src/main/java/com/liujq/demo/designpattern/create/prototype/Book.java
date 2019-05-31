package com.liujq.demo.designpattern.create.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 抽象类
 *
 * @author Jiqiang.Liu
 * @date 2019-05-31
 */
@Data
@AllArgsConstructor
public abstract class Book implements Cloneable {

    /**
     * 书名
     */
    private String name;

    /**
     * 作者
     */
    private String author;

    /**
     * 分类
     */
    private String type;

    /**
     * 内容
     */
    private String content;

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
