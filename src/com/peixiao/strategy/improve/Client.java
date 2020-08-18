package com.peixiao.strategy.improve;

/**
 * @Author: Peixiao Zhao
 */
public class Client {

    public static void main(String[] args) {

        Duck pekingDuck = new ToyDuck();
        pekingDuck.fly();
        System.out.println("----------------");
        pekingDuck.setFlyBehavior(new CanFly());
        pekingDuck.fly();
    }
}
