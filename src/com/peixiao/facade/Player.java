package com.peixiao.facade;

/**
 * @Author: Peixiao Zhao
 */
public class Player {

    // 使用单例模式饿汉式
    private static Player instance = new Player();

    public static Player getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("Player is ON");
    }

    public void off(){
        System.out.println("Player is OFF");
    }

    public void play(){
        System.out.println("Player is PLAY");
    }

    // ...
    public void pause(){
        System.out.println("Player is PAUSE");
    }
}
