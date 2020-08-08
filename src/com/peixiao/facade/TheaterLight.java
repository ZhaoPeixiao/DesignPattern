package com.peixiao.facade;

/**
 * @Author: Peixiao Zhao
 */
public class TheaterLight {

    private static TheaterLight instance = new TheaterLight();

    public TheaterLight getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("TheaterLight is ON");
    }

    public void off(){
        System.out.println("TheaterLight is OFF");
    }

    public void dim(){
        System.out.println("TheaterLight is DIM");
    }

    public void bright(){
        System.out.println("TheaterLight is BRIGHT");
    }

}
