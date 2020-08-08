package com.peixiao.composit;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Peixiao Zhao
 */
public class Department extends OrganizationComponent{

    public Department(String name, String des){
        super(name, des);
    }

    // 叶子节点
    // 不需要add和remove方法


    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    // Department
    @Override
    protected void print() {
        System.out.println("  " + getName() + ": " + getDes());
    }
}
