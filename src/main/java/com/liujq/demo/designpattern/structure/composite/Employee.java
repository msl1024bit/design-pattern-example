package com.liujq.demo.designpattern.structure.composite;

import lombok.Data;

/**
 * 角色
 *
 * @author Jiqiang.Liu
 * @date 2019-06-03
 */
@Data
public abstract class Employee {
    private String name;

    /**
     * 显示数据
     * @param index
     */
    public abstract void display(int index);
}
