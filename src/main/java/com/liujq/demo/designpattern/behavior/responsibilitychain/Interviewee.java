package com.liujq.demo.designpattern.behavior.responsibilitychain;

import lombok.Data;

/**
 * 面试者
 *
 * @author Jiqiang.Liu
 * @date 2019-05-31
 */
@Data
public class Interviewee {
    private String name;
    private Boolean teamLeaderOpinion;
    private Boolean managerOpinion;
    private Boolean hrOpinion;

    public Interviewee(String name) {
        this.name = name;
    }

}
