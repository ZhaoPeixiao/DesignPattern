package com.peixiao.iterator;

import java.util.Iterator;

/**
 * @Author: Peixiao Zhao
 */
public class ComputerCollegeIterator implements Iterator {

    // 这里我们需要知道数据是用什么方式存放
    Department[] departments;
    int position = 0;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (position >= departments.length || departments[position] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position ++;
        return department;
    }


    // 暂时不需要 空实现
    @Override
    public void remove() {

    }
}
