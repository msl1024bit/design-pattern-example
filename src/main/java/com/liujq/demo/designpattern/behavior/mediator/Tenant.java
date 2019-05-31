package com.liujq.demo.designpattern.behavior.mediator;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 租客
 *
 * @author Jiqiang.Liu
 * @date 2019-05-31
 */
public class Tenant {
    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private List<String> wantTypes;

    public Tenant(String name, List<String> wantTypes) {
        this.name = name;
        this.wantTypes = wantTypes;
    }

    private Mediator mediator = new RentingMediator();

    public void lookAtHouse() {
        mediator.supplyHouse(wantTypes);
    }
}
