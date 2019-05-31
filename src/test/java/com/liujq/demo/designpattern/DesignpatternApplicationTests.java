package com.liujq.demo.designpattern;

import com.liujq.demo.designpattern.behavior.command.*;
import com.liujq.demo.designpattern.behavior.iterator.NetEaseMusic;
import com.liujq.demo.designpattern.behavior.mediator.Tenant;
import com.liujq.demo.designpattern.behavior.responsibilitychain.Hr;
import com.liujq.demo.designpattern.behavior.responsibilitychain.Interviewee;
import com.liujq.demo.designpattern.behavior.responsibilitychain.Manager;
import com.liujq.demo.designpattern.behavior.responsibilitychain.TeamLeader;
import com.liujq.demo.designpattern.behavior.strategy.WashingMachine;
import com.liujq.demo.designpattern.behavior.strategy.WashingStrategy;
import com.liujq.demo.designpattern.behavior.strategy.WashingStrategyFactory;
import com.liujq.demo.designpattern.behavior.templatemethod.AdidasShoeAssemble;
import com.liujq.demo.designpattern.behavior.templatemethod.NikeShoeAssemble;
import com.liujq.demo.designpattern.behavior.templatemethod.ShoeAssembleTemplate;
import com.liujq.demo.designpattern.create.abstractfactory.AbstractCarFactory;
import com.liujq.demo.designpattern.create.abstractfactory.BMWCarFactory;
import com.liujq.demo.designpattern.create.abstractfactory.BenzCarFactory;
import com.liujq.demo.designpattern.create.builder.Director;
import com.liujq.demo.designpattern.create.factorymethod.MotorcycleGarage;
import com.liujq.demo.designpattern.create.factorymethod.People;
import com.liujq.demo.designpattern.create.factorymethod.SportsCarGarage;
import com.liujq.demo.designpattern.create.factorymethod.IVehicle;
import com.liujq.demo.designpattern.create.prototype.Book;
import com.liujq.demo.designpattern.create.prototype.ConcreteBook;
import com.liujq.demo.designpattern.create.singleton.Car;
import com.liujq.demo.designpattern.create.singleton.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DesignpatternApplicationTests {

    @Test
    public void contextLoads() {
    }

    /**
     * 单例模式
     * <p>小明就只有 1 辆车</p>
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
     * <p>小明家的车库</p>
     *
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
     * <p>宝马车就得用宝马轮胎和宝马方向盘</p>
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
     * <p>汤这么煲</p>
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

    /**
     * 原型模式
     * <p>复印书籍</p>
     */
    @Test
    public void testPrototype() {
        Book book = new ConcreteBook("娱乐至死", "尼尔波兹曼", "社会科学", "XXXX");
        System.out.println("复印书籍：" + book.getName() + "，第 " + 1 + " 本");

        for (int i = 2; i <= 10; i++) {
            Book book1 = (Book) book.clone();
            System.out.println("复印书籍：" + book1.getName() + "，第 " + i + " 本");
        }
    }

    /**
     * 模板方法模式
     * <p>运动鞋制造过程</p>
     */
    @Test
    public void testTemplateMethod() {
        // 制造adidas鞋
        ShoeAssembleTemplate adidasShoeAssemble = new AdidasShoeAssemble();
        adidasShoeAssemble.assembleShoe();

        // 制造nike鞋
        ShoeAssembleTemplate nikeShoeAssemble = new NikeShoeAssemble();
        nikeShoeAssemble.assembleShoe();
    }

    /**
     * 中介者模式
     * <p>租房找中介</p>
     */
    @Test
    public void testMediator() {
        System.out.println("小明想要看小区房和农民房");
        Tenant tenant = new Tenant("小明", Arrays.asList("小区房", "农民房"));
        tenant.lookAtHouse();
    }

    /**
     * 命令模式
     * <p>技术经理分配任务</p>
     */
    @Test
    public void testCommand() {
        Developer developer = new Developer("小明");
        Requirement requirement = new Requirement("新增黑名单需求");
        DevelopCommand developCommand = new DevelopCommand(developer);
        SuspendCommand suspendCommand = new SuspendCommand(developer);

        TechnicalManager technicalManager = new TechnicalManager("老张");
        technicalManager.setCommand(developCommand);
        technicalManager.action(requirement);

        System.out.println("开发了 2 天，需求变故，需要暂停。。。");

        technicalManager.setCommand(suspendCommand);
        technicalManager.action(requirement);
    }

    /**
     * 责任链模式
     * <p>面试过五关斩六将</p>
     */
    @Test
    public void testResponsibilityChain() {
        Interviewee interviewee = new Interviewee("小明");
        TeamLeader teamLeader = new TeamLeader("张三");
        Manager manager = new Manager("李四");
        Hr hr = new Hr("王五");

        // 设置面试顺序
        teamLeader.setNextInterviewer(manager);
        manager.setNextInterviewer(hr);

        // 开始面试
        System.out.println("开始面试");
        teamLeader.handleInterview(interviewee);
    }

    /**
     * 策略模式
     */
    @Test
    public void testStrategy() {
        WashingStrategyFactory factory = new WashingStrategyFactory();
        WashingStrategy standard = factory.getStrategy("Standard");
        WashingMachine washingMachine = new WashingMachine(standard);
        washingMachine.washClothes();
    }

    /**
     * 迭代器模式
     */
    @Test
    public void testIterator() {
        NetEaseMusic netEaseMusic = new NetEaseMusic();
        netEaseMusic.listenByLoop();
    }
}
