package com.peixiao.composit;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Peixiao Zhao
 */
public class College extends OrganizationComponent{
    List<OrganizationComponent> departments = new ArrayList<>();


    public College(String name, String des){
        super(name, des);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        departments.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        departments.remove(organizationComponent);
    }


    // 输出 College 包含的 Department
    @Override
    protected void print() {
        System.out.println(getName() + ": " + getDes());
        for (OrganizationComponent department : departments) {
            department.print();
        }
    }
}
