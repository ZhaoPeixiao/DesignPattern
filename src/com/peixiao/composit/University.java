package com.peixiao.composit;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Peixiao Zhao
 */

// University 就是 composite，管理college
public class University extends OrganizationComponent{

    List<OrganizationComponent> colleges = new ArrayList<>();


    public University(String name, String des){
        super(name, des);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        colleges.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        colleges.remove(organizationComponent);
    }


    // 输出 University 包含的 College
    @Override
    protected void print() {
        System.out.println(getName() + ": " + getDes());
        System.out.println("==========================");
        for (OrganizationComponent college : colleges) {
            college.print();
            System.out.println("--------------------------");
        }
    }
}
