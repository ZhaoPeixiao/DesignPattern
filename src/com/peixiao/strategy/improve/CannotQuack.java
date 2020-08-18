package com.peixiao.strategy.improve;

/**
 * @Author: Peixiao Zhao
 */
public class CannotQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("cannot quack");
    }
}
