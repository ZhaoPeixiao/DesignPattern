package com.peixiao.strategy.improve;

/**
 * @Author: Peixiao Zhao
 */
public class CanQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("can quack well");
    }
}
