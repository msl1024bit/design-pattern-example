package com.liujq.demo.designpattern.create.singleton;

/**
 * Person类
 * <p>使用同一辆车去做不同的事</p>
 * <p>车是单例</p>
 *
 * @author Jiqiang.Liu
 * @date 2019-05-30
 */
public class Person {

    public Car goTravel() {
        System.out.println("开车去旅游");
        Car car = Car.getInstance();
        car.run();
        return car;
    }

    public Car goWork() {
        System.out.println("开车去上班");
        Car car = Car.getInstance();
        car.run();
        return car;
    }

    public Car goDate() {
        System.out.println("开车去约会");
        Car car = Car.getInstance();
        car.run();
        return car;
    }
}
