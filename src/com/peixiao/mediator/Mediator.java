package com.peixiao.mediator;

/**
 * @Author: Peixiao Zhao
 */
public abstract class Mediator {

    public abstract void register(String colleagueName, Colleague colleague);

    public abstract void getMessage(int stateChange, String colleagueName);

    public abstract void sendMessage();
}
