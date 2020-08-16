package com.peixiao.memento.game;

import java.util.HashMap;
import java.util.List;

/**
 * @Author: Peixiao Zhao
 */
public class Caretaker {

    private Memento memento;
//    private List<Memento> mementoList;
//    private HashMap<String, List<Memento>> mementoMap;


    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }


}
