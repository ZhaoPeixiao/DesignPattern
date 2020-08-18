package com.peixiao.strategy.improve;

/**
 * @Author: Peixiao Zhao
 */
public class PekingDuck extends Duck {

    public PekingDuck() {
        flyBehavior = new BadFly();
        quackBehavior = new BadQuack();
    }

    @Override
    public void display() {
        System.out.println("This is a Peking duck");
    }


}
