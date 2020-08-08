package com.peixiao.facade;

/**
 * @Author: Peixiao Zhao
 */
public class Popcorn {

    private static Popcorn instance = new Popcorn();

    public Popcorn getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("Popcorn is ON");
    }

    public void off(){
        System.out.println("Popcorn is OFF");
    }

    public void serve(){
        System.out.println("Popcorn is SERVE");
    }


}
