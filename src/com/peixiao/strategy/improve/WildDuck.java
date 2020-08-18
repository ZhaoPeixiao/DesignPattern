package com.peixiao.strategy.improve;

/**
 * @Author: Peixiao Zhao
 */
public class WildDuck extends Duck {

    public WildDuck() {
        flyBehavior = new CanFly();
        quackBehavior = new CanQuack();
    }

    @Override
    public void display() {
        System.out.println("This is a wild duck");
    }
}
