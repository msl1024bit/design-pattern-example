package com.liujq.demo.designpattern.behavior.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 酒店
 *
 * @author Jiqiang.Liu
 * @date 2019-06-03
 */
public class Hotel {
    private List<Company> companies = new ArrayList<>();
    public void add(Company company) {
        companies.add(company);
    }

    /**
     * 招待访问者
     * @param visitor
     */
    public void entertain(Visitor visitor) {
        companies.forEach(company -> company.accept(visitor));
    }
}
