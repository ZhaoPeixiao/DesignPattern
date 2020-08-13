package com.peixiao.iterator;

import java.util.Iterator;

/**
 * @Author: Peixiao Zhao
 */
public class ComputerCollege implements College{

    Department[] departments;
    int numOfDepartment = 0; // 保存当前数组对象个数

    public ComputerCollege() {
        this.departments = new Department[5];
        addDepartment("Java", "java");
        addDepartment("PHP", "php");
        addDepartment("Big Data", "big data");
    }

    @Override
    public String getName() {
        return "Computer Science ";
    }

    @Override
    public void addDepartment(String name, String des) {
        Department department = new Department(name, des);
        departments[numOfDepartment] = department;
        numOfDepartment ++;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
