package com.peixiao.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Peixiao Zhao
 */
public class Caretaker {

    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento){
        mementoList.add(memento);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
