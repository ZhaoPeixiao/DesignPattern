package com.peixiao.strategy.improve;

/**
 * @Author: Peixiao Zhao
 */
public class CannotFly implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Cannot fly");
    }
}
