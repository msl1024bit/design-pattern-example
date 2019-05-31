package com.liujq.demo.designpattern.behavior.responsibilitychain;

import java.util.Random;

/**
 * 面试官：小组长
 *
 * @author Jiqiang.Liu
 * @date 2019-05-31
 */
public class TeamLeader extends Interviewer {
    public TeamLeader(String name) {
        super(name);
    }

    @Override
    public void handleInterview(Interviewee interviewee) {
        System.out.println("组长" + name + "面试" + interviewee.getName()+ "同学");
        interviewee.setTeamLeaderOpinion(new Random().nextBoolean());
        if (interviewee.getTeamLeaderOpinion()) {
            System.out.println("组长轮面试: 通过");
            this.nextInterviewer.handleInterview(interviewee);
        } else {
            System.out.println("组长轮面试: 不通过");
            System.out.println("面试结束");
        }
    }
}
