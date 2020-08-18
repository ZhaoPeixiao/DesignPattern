package com.peixiao.strategy.improve;

/**
 * @Author: Peixiao Zhao
 */
public class BadFly implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("can fly");
    }
}
