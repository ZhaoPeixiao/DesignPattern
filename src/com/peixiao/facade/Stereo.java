package com.peixiao.facade;

/**
 * @Author: Peixiao Zhao
 */
public class Stereo {

    private static Stereo instance = new Stereo();

    public Stereo getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("Stereo is ON");
    }

    public void off(){
        System.out.println("Stereo is OFF");
    }

    public void up(){
        System.out.println("Stereo is UP");
    }

    public void down(){
        System.out.println("Stereo is down");
    }
}
