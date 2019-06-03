package com.liujq.demo.designpattern.structure.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 领导类
 * <p>组长和经理都属于这个类</p>
 *
 * @author Jiqiang.Liu
 * @date 2019-06-03
 */
public class Leader extends Employee {

    private List<Employee> employees;

    public Leader(String name) {
        this.setName(name);
        employees = new ArrayList<>();
    }

    /**
     * 添加下属
     * @param employee
     */
    public void add(Employee employee) {
        employees.add(employee);

    }

    /**
     * 移除下属
     * @param employee
     */
    public void remove(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public void display(int index) {
        for(int i = 0; i < index; i++) {
            System.out.print("----");
        }
        System.out.println("领导：" + this.getName());
        this.employees.forEach(employee -> employee.display(index + 1));
    }
}
