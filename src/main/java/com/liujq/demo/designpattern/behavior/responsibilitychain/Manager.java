package com.liujq.demo.designpattern.behavior.responsibilitychain;

import java.util.Random;

/**
 * 面试官：部门经理
 *
 * @author Jiqiang.Liu
 * @date 2019-05-31
 */
public class Manager extends Interviewer {
    public Manager(String name) {
        super(name);
    }

    @Override
    public void handleInterview(Interviewee interviewee) {
        System.out.println("部门经理" + name + "面试" + interviewee.getName() + "同学");
        interviewee.setManagerOpinion(new Random().nextBoolean());
        if (interviewee.getManagerOpinion()) {
            System.out.println("部门经理轮面试: 通过");
            this.nextInterviewer.handleInterview(interviewee);
        } else {
            System.out.println("部门经理轮面试: 不通过");
            System.out.println("面试结束");
        }
    }
}
