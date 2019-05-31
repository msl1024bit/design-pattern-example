package com.liujq.demo.designpattern.behavior.observer;

import java.util.List;

/**
 * @author Jiqiang.Liu
 * @date 2019-05-31
 */
public class User implements Observer, Observable {

    private List<Observer> friends;

    @Override
    public void addObserver(Observer observer) {
        friends.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        friends.remove(observer);
    }

    @Override
    public void notifyObservers(String msg) {

    }
}
