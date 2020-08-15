package com.peixiao.mediator;

/**
 * @Author: Peixiao Zhao
 */
public class Alarm extends Colleague{


    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange, this.name);
    }

    public void sendAlarm(int stateChange){
        sendMessage(stateChange);
    }
}
