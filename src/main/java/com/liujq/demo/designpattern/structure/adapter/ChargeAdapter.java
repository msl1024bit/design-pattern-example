package com.liujq.demo.designpattern.structure.adapter;

/**
 * 插头转换器
 *
 * @author Jiqiang.Liu
 * @date 2019-06-03
 */
public class ChargeAdapter implements Target {

    private BritishCharger britishCharger;

    public ChargeAdapter(BritishCharger britishCharger) {
        this.britishCharger = britishCharger;
    }

    @Override
    public void chargeByChineseStandard() {
        System.out.println("使用中英式插头转换器");
        britishCharger.chargeByBritishStandard();
    }
}
