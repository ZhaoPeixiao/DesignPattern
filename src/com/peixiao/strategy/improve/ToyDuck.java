package com.peixiao.strategy.improve;

/**
 * @Author: Peixiao Zhao
 */
public class ToyDuck extends Duck {

    public ToyDuck() {
        flyBehavior = new CannotFly();
        quackBehavior = new CannotQuack();
    }

    @Override
    public void display() {
        System.out.println("This is a toy duck");
    }

}
