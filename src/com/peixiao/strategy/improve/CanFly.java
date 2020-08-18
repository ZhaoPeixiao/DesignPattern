package com.peixiao.strategy.improve;

/**
 * @Author: Peixiao Zhao
 */
public class CanFly implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Can fly well");
    }
}
