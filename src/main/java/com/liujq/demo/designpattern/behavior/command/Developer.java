package com.liujq.demo.designpattern.behavior.command;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 开发人员
 *
 * @author Jiqiang.Liu
 * @date 2019-05-31
 */
@Data
@AllArgsConstructor
public class Developer {
    private String name;

    public void develop(Requirement requirement) {
        System.out.println(this.name + " 开始开发需求：" + requirement.getName());
    }

    public void suspend(Requirement requirement) {
        System.out.println(this.name + " 暂停开发需求：" + requirement.getName());
    }
}
