package com.liujq.demo.designpattern;

import com.liujq.demo.designpattern.abstractfactory.AbstractCarFactory;
import com.liujq.demo.designpattern.abstractfactory.BMWCarFactory;
import com.liujq.demo.designpattern.abstractfactory.BenzCarFactory;
import com.liujq.demo.designpattern.builder.Director;
import com.liujq.demo.designpattern.factorymethod.MotorcycleGarage;
import com.liujq.demo.designpattern.factorymethod.People;
import com.liujq.demo.designpattern.factorymethod.SportsCarGarage;
import com.liujq.demo.designpattern.factorymethod.IVehicle;
import com.liujq.demo.designpattern.singleton.Car;
import com.liujq.demo.designpattern.singleton.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DesignpatternApplicationTests {

    @Test
    public void contextLoads() {
    }

    /**
     * 单例模式
     */
    @Test
    public void testSingleton() {
        Person person = new Person();
        Car car1 = person.goTravel();
        Car car2 = person.goDate();
        Car car3 = person.goWork();
        System.out.println("car1 == car2 ? " + (car1 == car2));
        System.out.println("car2 == car3 ? " + (car2 == car3));
    }

    /**
     * 工厂方法模式
     */
    @Test
    public void testFactoryMethod() {
        People people = new People();

        SportsCarGarage sportsCarGarage = new SportsCarGarage();
        IVehicle car = sportsCarGarage.getVehicle();
        people.goTravel(car);

        System.out.println("=============================");

        MotorcycleGarage motorcycleGarage = new MotorcycleGarage();
        IVehicle motorcycle = motorcycleGarage.getVehicle();
        people.goSchool(motorcycle);
    }

    /**
     * 抽象工厂模式
     */
    @Test
    public void testAbstractFactory() {
        System.out.println("BMW工厂生产汽车");
        AbstractCarFactory bmwCarFactory = new BMWCarFactory();
        bmwCarFactory.installTyre();
        bmwCarFactory.installWheel();

        System.out.println("=============================");

        System.out.println("奔驰工厂生产汽车");
        AbstractCarFactory benzCarFactory = new BenzCarFactory();
        benzCarFactory.installTyre();
        benzCarFactory.installWheel();
    }

    /**
     * 建造者模式
     */
    @Test
    public void testBuilder() {
        Director director = new Director();

        // 熬制板栗排骨汤
        System.out.println("熬制板栗排骨汤 开始:");
        director.buildBanLiPaiGuSoup();
        System.out.println("熬制板栗排骨汤 结束:");

        System.out.println("=============================");

        // 熬制冬瓜排骨汤
        System.out.println("熬制冬瓜排骨汤 开始:");
        director.buildDongGuaPaiGuSoup();
        System.out.println("熬制冬瓜排骨汤 结束:");
    }
}
