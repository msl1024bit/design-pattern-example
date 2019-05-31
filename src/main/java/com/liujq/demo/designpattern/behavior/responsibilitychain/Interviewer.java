package com.liujq.demo.designpattern.behavior.responsibilitychain;

/**
 * 面试官抽象类
 *
 * @author Jiqiang.Liu
 * @date 2019-05-31
 */
public abstract class Interviewer {
    protected String name;
    protected Interviewer nextInterviewer;

    public Interviewer(String name) {
        this.name = name;
    }

    /**
     * 设置下一轮面试官
     *
     * @param nextInterviewer
     */
    public void setNextInterviewer(Interviewer nextInterviewer) {
        this.nextInterviewer = nextInterviewer;
    }

    /**
     * 面试
     *
     * @param interviewee 面试者
     */
    public abstract void handleInterview(Interviewee interviewee);
}
