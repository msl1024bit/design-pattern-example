package com.liujq.demo.designpattern.singleton;

/**
 * @author Jiqiang.Liu
 * @date 2019-05-30
 */
public class Car {

    /**
     * 内部实例化
     */
    private static Car car = new Car();

    /**
     * 私有构造方法 使得外部不能通过构造方法实例化
     */
    private Car() {
    }

    /**
     * 对外提供静态方法获取实例
     *
     * @return
     */
    public static Car getInstance() {
        return car;
    }

    public void run() {
        System.out.println("car is running");
    }
}
