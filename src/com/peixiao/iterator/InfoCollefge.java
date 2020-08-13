package com.peixiao.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: Peixiao Zhao
 */
public class InfoCollefge implements College{

    List<Department> departments;

    public InfoCollefge() {
        departments = new ArrayList<Department>();
        addDepartment("Information Security", "information security");
        addDepartment("Internet Security", "internet security");
        addDepartment("Service Security", "service security");
    }

    @Override
    public String getName() {
        return "Information College";
    }

    @Override
    public void addDepartment(String name, String des) {
        Department department = new Department(name, des);
        departments.add(department);
    }

    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator(departments);
    }
}
