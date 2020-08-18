package com.peixiao.strategy;

/**
 * @Author: Peixiao Zhao
 */
public abstract class Duck {

    public Duck() {
    }

    public void quack(){
        System.out.println("Ga Ga Ga");
    }

    public void swim(){
        System.out.println("Duck can swim");
    }

    public void fly(){
        System.out.println("Duck can fly");
    }

    public abstract void display();
}
