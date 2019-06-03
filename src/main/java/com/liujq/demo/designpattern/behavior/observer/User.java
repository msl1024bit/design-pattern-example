package com.liujq.demo.designpattern.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 用户
 * <p>既是观察者又是被观察者</p>
 *
 * @author Jiqiang.Liu
 * @date 2019-05-31
 */
public class User implements Observer, Observable {

    private String name;

    private List<Observer> friends;

    public User(String name) {
        this.name = name;
        this.friends = new ArrayList<>();
    }

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
        friends.forEach(observer -> observer.update(name, msg));
    }

    @Override
    public void update(String name, String message) {
        System.out.println("【" + this.name + "】看到【" + name + "】发的朋友圈：" + message);
    }

    public void sendMsg(String msg) {
        this.notifyObservers(msg);
    }
}
