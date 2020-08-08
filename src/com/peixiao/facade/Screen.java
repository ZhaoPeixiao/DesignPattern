package com.peixiao.facade;

/**
 * @Author: Peixiao Zhao
 */
public class Screen {

    private static Screen instance = new Screen();

    public Screen getInstance(){
        return instance;
    }

    public void up(){
        System.out.println("Screen is UP");
    }

    public void down(){
        System.out.println("Screen is DOWN");
    }
}
