package com.liujq.demo.designpattern.behavior.responsibilitychain;

import java.util.Random;

/**
 * 面试官：HR
 *
 * @author Jiqiang.Liu
 * @date 2019-05-31
 */
public class Hr extends Interviewer {
    public Hr(String name) {
        super(name);
    }

    @Override
    public void handleInterview(Interviewee interviewee) {
        System.out.println("HR" + name + "面试" + interviewee.getName() + "同学");
        interviewee.setHrOpinion(new Random().nextBoolean());
        if (interviewee.getHrOpinion()) {
            System.out.println("HR轮面试: 通过, 拿到offer");
        } else {
            System.out.println("HR轮面试: 不通过");
            System.out.println("面试结束");
        }
    }
}
