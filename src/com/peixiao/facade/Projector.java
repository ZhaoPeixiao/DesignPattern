package com.peixiao.facade;

/**
 * @Author: Peixiao Zhao
 */
public class Projector {

    private static Projector instance = new Projector();

    public Projector getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("Projector is ON");
    }

    public void off(){
        System.out.println("Projector is OFF");
    }

    public void focus(){
        System.out.println("Projector is FOCUS");
    }
}
