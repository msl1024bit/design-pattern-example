package com.liujq.demo.designpattern.behavior.observer;

/**
 * 被观察者接口
 *
 * @author Jiqiang.Liu
 * @date 2019-05-31
 */
public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String msg);
}
