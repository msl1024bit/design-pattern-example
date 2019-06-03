package com.liujq.demo.designpattern;

import com.liujq.demo.designpattern.behavior.command.*;
import com.liujq.demo.designpattern.behavior.interpreter.*;
import com.liujq.demo.designpattern.behavior.iterator.NetEaseMusic;
import com.liujq.demo.designpattern.behavior.mediator.Tenant;
import com.liujq.demo.designpattern.behavior.memento.App;
import com.liujq.demo.designpattern.behavior.memento.Deployer;
import com.liujq.demo.designpattern.behavior.memento.Space;
import com.liujq.demo.designpattern.behavior.observer.User;
import com.liujq.demo.designpattern.behavior.responsibilitychain.Hr;
import com.liujq.demo.designpattern.behavior.responsibilitychain.Interviewee;
import com.liujq.demo.designpattern.behavior.responsibilitychain.Manager;
import com.liujq.demo.designpattern.behavior.responsibilitychain.TeamLeader;
import com.liujq.demo.designpattern.behavior.state.ApplyState;
import com.liujq.demo.designpattern.behavior.state.RegisterState;
import com.liujq.demo.designpattern.behavior.strategy.WashingMachine;
import com.liujq.demo.designpattern.behavior.strategy.WashingStrategy;
import com.liujq.demo.designpattern.behavior.strategy.WashingStrategyFactory;
import com.liujq.demo.designpattern.behavior.templatemethod.AdidasShoeAssemble;
import com.liujq.demo.designpattern.behavior.templatemethod.NikeShoeAssemble;
import com.liujq.demo.designpattern.behavior.templatemethod.ShoeAssembleTemplate;
import com.liujq.demo.designpattern.behavior.visitor.*;
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
import com.liujq.demo.designpattern.structure.adapter.BritishCharger;
import com.liujq.demo.designpattern.structure.adapter.ChargeAdapter;
import com.liujq.demo.designpattern.structure.bridge.AndroidPhone;
import com.liujq.demo.designpattern.structure.bridge.Chrome;
import com.liujq.demo.designpattern.structure.bridge.FireFox;
import com.liujq.demo.designpattern.structure.bridge.IOSPhone;
import com.liujq.demo.designpattern.structure.composite.Engineer;
import com.liujq.demo.designpattern.structure.composite.Leader;
import com.liujq.demo.designpattern.structure.decorator.CommonHerbalJelly;
import com.liujq.demo.designpattern.structure.decorator.HoneyHerbalJelly;
import com.liujq.demo.designpattern.structure.decorator.MilkHerbalJelly;
import com.liujq.demo.designpattern.structure.facade.Demander;
import com.liujq.demo.designpattern.structure.flyweight.CrayonFactory;
import com.liujq.demo.designpattern.structure.flyweight.ICrayon;
import com.liujq.demo.designpattern.structure.proxy.ChineseNetwork;
import com.liujq.demo.designpattern.structure.proxy.WorldNetwork;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
     * <p>洗衣模式</p>
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
     * <p>听歌这件事</p>
     */
    @Test
    public void testIterator() {
        NetEaseMusic netEaseMusic = new NetEaseMusic();
        netEaseMusic.listenByLoop();
    }

    /**
     * 观察者模式
     * <p>朋友圈</p>
     */
    @Test
    public void testObserver() {
        User xiaoming = new User("小明");
        User xiaohong = new User("小红");
        User xiaodong = new User("小东");
        xiaoming.addObserver(xiaohong);
        xiaoming.addObserver(xiaodong);
        xiaoming.sendMsg("今天真开心");
        xiaoming.removeObserver(xiaohong);
        xiaoming.sendMsg("希望明天也像今天一样开心");

        xiaohong.addObserver(xiaoming);
        xiaohong.addObserver(xiaodong);
        xiaohong.sendMsg("今天和小明吵架了，屏蔽他的朋友圈");

        xiaodong.addObserver(xiaoming);
        xiaodong.addObserver(xiaohong);
        xiaodong.sendMsg("小明和小红吵架了，夹在中间好尴尬");
    }

    /**
     * 状态模式
     * <p>P2P借款状态流程</p>
     */
    @Test
    public void testState() {
        com.liujq.demo.designpattern.behavior.state.User user = new com.liujq.demo.designpattern.behavior.state.User();
        user.setState(new RegisterState());
        user.apply();
        user.draw(1000);

        user.setState(new ApplyState());
        user.draw(2000);
    }

    /**
     * 备忘录模式
     * <p>你的发布平台好用么？</p>
     */
    @Test
    public void testMemento() {
        Deployer deployer = new Deployer();
        deployer.setApp(new App("apply-system", "1.0.0"));

        System.out.println("1. 暂停旧应用");
        deployer.stopApp();

        System.out.println("2. 备份旧应用");
        Space space = new Space();
        space.setAppBackup(deployer.createAppBackup());

        System.out.println("3. 拷贝新应用到服务");
        deployer.setApp(new App("apply-system","2.0.0"));
        deployer.showApp();

        System.out.println("4. 启动新应用");
        deployer.startApp();

        System.out.println("5. 有异常，暂停应用");
        deployer.stopApp();

        System.out.println("6. 回滚旧应用，拷贝备份的旧应用到服务器");
        deployer.setAppBackup(space.getAppBackup());
        deployer.showApp();

        System.out.println("7. 启动备份的旧应用");
        deployer.startApp();
    }

    /**
     * 解释器模式
     * <p>SQL解析</p>
     */
    @Test
    public void testInterpreter() {
        Context context = new Context();
        context.setTableName("user");

        // insert
        Map<String, Object> params = new HashMap<>();
        params.put("name", "小明");
        params.put("job", "Java工程师");
        context.setParams(params);
        SQLExpression sqlExpression = new InsertSQLExpression();
        String sql = sqlExpression.interpret(context);

        // delete
        Map<String, Object> wheres = new HashMap<>();
        wheres.put("name", "小明");
        context.setParams(null);
        context.setWheres(wheres);
        sqlExpression = new DeleteSQLExpression();
        sql = sqlExpression.interpret(context);

        // Update SQL
        params = new HashMap<>();
        params.put("job", "Java 高级工程师");
        wheres = new HashMap<>();
        wheres.put("name", "小明");
        context.setParams(params);
        context.setWheres(wheres);
        sqlExpression = new UpdateSQLExpression();
        sql = sqlExpression.interpret(context);

        // Select SQL
        wheres = new HashMap<>();
        wheres.put("name", "小明");
        context.setParams(null);
        context.setWheres(wheres);
        sqlExpression = new SelectSQLExpression();
        sql = sqlExpression.interpret(context);
    }

    /**
     * 访问者模式
     * <p>宴请领导人</p>
     */
    @Test
    public void testVisitor() {
        Alibaba alibaba = new Alibaba();
        Tencent tencent = new Tencent();
        NationalLeaderVistor nationalLeaderVistor = new NationalLeaderVistor();
        ProvincialLeaderVistor provincialLeaderVistor = new ProvincialLeaderVistor();

        Hotel hotel = new Hotel();
        hotel.add(alibaba);
        hotel.add(tencent);

        hotel.entertain(nationalLeaderVistor);
        hotel.entertain(provincialLeaderVistor);
    }

    /**
     * 适配器模式
     * <p>你用过港式插座转换器么？</p>
     */
    @Test
    public void testAdapter() {
        BritishCharger britishCharger = new BritishCharger();
        ChargeAdapter chargeAdapter = new ChargeAdapter(britishCharger);
        chargeAdapter.chargeByChineseStandard();
    }

    /**
     * 桥接模式
     * <p>IOS、Android 二分天下</p>
     */
    @Test
    public void testBridge() {
        Chrome chrome = new Chrome();
        FireFox fireFox = new FireFox();

        AndroidPhone androidPhone = new AndroidPhone(chrome);
        androidPhone.openSoftware();

        androidPhone.setSoftware(fireFox);
        androidPhone.openSoftware();

        IOSPhone iosPhone = new IOSPhone(chrome);
        iosPhone.openSoftware();

        iosPhone.setSoftware(fireFox);
        iosPhone.openSoftware();
    }

    /**
     * 组合模式
     * <p>程序猿组织架构</p>
     */
    @Test
    public void testComposite() {
        Leader manager = new Leader("经理");
        Leader grouper = new Leader("组长");
        Engineer xiaoming = new Engineer("小明");
        Engineer xiaodong = new Engineer("小东");
        manager.add(grouper);
        grouper.add(xiaoming);
        grouper.add(xiaodong);

        manager.display(0);
    }

    /**
     * 装饰者模式
     * <p>夏天到了，吃碗龟苓膏解解暑</p>
     */
    @Test
    public void testDecorator() {
        CommonHerbalJelly commonHerbalJelly = new CommonHerbalJelly();

        // 小明的蜂蜜龟苓膏
        HoneyHerbalJelly honeyHerbalJelly = new HoneyHerbalJelly(commonHerbalJelly);
        honeyHerbalJelly.process();

        // 小红的蜂蜜牛奶龟苓膏
        MilkHerbalJelly milkHerbalJelly = new MilkHerbalJelly(honeyHerbalJelly);
        milkHerbalJelly.process();
    }

    /**
     * 外观模式
     * <p>你需要一个技术组长</p>
     */
    @Test
    public void testFacade() {
        Demander demander = new Demander();
        demander.demand("开发一个跟微信一样的系统");
    }

    /**
     * 享元模式
     * <p>还记得童年的蜡笔画么？</p>
     */
    @Test
    public void testFlyWeight() {
        System.out.println("小明开始画画");
        ICrayon greenCrayon = CrayonFactory.getCrayon("绿色");
        greenCrayon.draw("草");

        ICrayon grayCrayon = CrayonFactory.getCrayon("灰色");
        grayCrayon.draw("路");

        System.out.println("==================");

        System.out.println("晓东开始画画");
        ICrayon blueCrayon = CrayonFactory.getCrayon("蓝色");
        blueCrayon.draw("蓝天");

        ICrayon greenCrayon1 = CrayonFactory.getCrayon("绿色");
        greenCrayon1.draw("树");
    }

    /**
     * 代理模式
     * <p>你我都知道的这道墙</p>
     */
    @Test
    public void testProxy() {
        WorldNetwork worldNetwork = new WorldNetwork();
        ChineseNetwork chineseNetwork = new ChineseNetwork(worldNetwork);
        chineseNetwork.access("www.google.com");
        chineseNetwork.access("www.baidu.com");
    }
}
