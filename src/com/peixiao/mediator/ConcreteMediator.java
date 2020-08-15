package com.peixiao.mediator;

import java.util.HashMap;

/**
 * @Author: Peixiao Zhao
 */
public class ConcreteMediator extends Mediator{
    private HashMap<String, Colleague> colleagueHashMap;
    private HashMap<String, String> interMap;

    public ConcreteMediator() {
        this.colleagueHashMap = new HashMap<>();
        this.interMap = new HashMap<>();
    }

    @Override
    public void register(String colleagueName, Colleague colleague) {
        colleagueHashMap.put(colleagueName, colleague);
        if (colleague instanceof Alarm){
            interMap.put("Alarm", colleagueName);
        }
    }

    @Override
    public void getMessage(int stateChange, String colleagueName) {
//        if (colleagueHashMap.get(colleagueName) instanceof Alarm){
//            if (stateChange == 0) {
//
//            }
//        }
    }

    @Override
    public void sendMessage() {

    }
}
