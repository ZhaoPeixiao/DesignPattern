package com.peixiao.strategy.improve;

/**
 * @Author: Peixiao Zhao
 */
public class BadQuack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("can quack");
    }
}
