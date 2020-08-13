package com.peixiao.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @Author: Peixiao Zhao
 */
public class InfoCollegeIterator implements Iterator {


    List<Department> departments;
    int index = -1;

    public InfoCollegeIterator(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (index >= departments.size() - 1) {
            return false;
        }else {
            index += 1;
            return true;
        }
    }

    @Override
    public Object next() {
        return departments.get(index);
    }

    // 空实现
    @Override
    public void remove() {

    }
}
