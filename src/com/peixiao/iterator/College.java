package com.peixiao.iterator;

import java.util.Iterator;

/**
 * @Author: Peixiao Zhao
 */
public interface College {

    public String getName();

    // 增加系
    public void addDepartment(String name, String des);

    public Iterator createIterator();


}
